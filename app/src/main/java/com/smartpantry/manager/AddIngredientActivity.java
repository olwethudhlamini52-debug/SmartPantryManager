package com.smartpantry.manager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddIngredientActivity extends AppCompatActivity {

    private EditText ingredientName;
    private EditText ingredientQuantity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_ingredient);

        ingredientName = findViewById(R.id.ingredientName);
        ingredientQuantity = findViewById(R.id.ingredientQuantity);

        Button saveIngredientButton =
                findViewById(R.id.saveIngredientButton);

        Button viewPantryButton =
                findViewById(R.id.viewPantryButton);

        Button findRecipesButton =
                findViewById(R.id.findRecipesButton);

        saveIngredientButton.setOnClickListener(v -> {

            String name =
                    ingredientName.getText().toString().trim();

            String quantity =
                    ingredientQuantity.getText().toString().trim();

            if (name.isEmpty()) {
                ingredientName.setError("Enter an ingredient");
                ingredientName.requestFocus();
                return;
            }

            if (quantity.isEmpty()) {
                ingredientQuantity.setError("Enter a quantity");
                ingredientQuantity.requestFocus();
                return;
            }

            SharedPreferences preferences =
                    getSharedPreferences(
                            "PantryData",
                            MODE_PRIVATE
                    );

            String oldIngredients =
                    preferences.getString(
                            "ingredients",
                            ""
                    );

            String newIngredient =
                    name + " - Quantity: " + quantity;

            String updatedIngredients;

            if (oldIngredients.isEmpty()) {

                updatedIngredients =
                        newIngredient;

            } else {

                updatedIngredients =
                        oldIngredients +
                        "\n" +
                        newIngredient;
            }

            preferences.edit()
                    .putString(
                            "ingredients",
                            updatedIngredients
                    )
                    .apply();

            Toast.makeText(
                    AddIngredientActivity.this,
                    "Ingredient added successfully!",
                    Toast.LENGTH_SHORT
            ).show();

            ingredientName.setText("");
            ingredientQuantity.setText("");

            ingredientName.requestFocus();
        });

        viewPantryButton.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            AddIngredientActivity.this,
                            PantryActivity.class
                    );

            startActivity(intent);
        });

        findRecipesButton.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            AddIngredientActivity.this,
                            RecipesActivity.class
                    );

            startActivity(intent);
        });
    }
}

