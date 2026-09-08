package com.smartpantry.manager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class PantryActivity extends AppCompatActivity {

    private TextView pantryList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pantry);

        pantryList = findViewById(R.id.pantryList);

        Button addMoreButton = findViewById(R.id.addMoreButton);
        Button recipesButton = findViewById(R.id.recipesButton);

        addMoreButton.setOnClickListener(v -> {
            Intent intent = new Intent(
                    PantryActivity.this,
                    AddIngredientActivity.class
            );
            startActivity(intent);
        });

        recipesButton.setOnClickListener(v -> {
            Intent intent = new Intent(
                    PantryActivity.this,
                    RecipesActivity.class
            );
            startActivity(intent);
        });

        loadIngredients();
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (pantryList != null) {
            loadIngredients();
        }
    }

    private void loadIngredients() {

        SharedPreferences preferences =
                getSharedPreferences("PantryData", MODE_PRIVATE);

        String ingredients =
                preferences.getString("ingredients", "");

        if (ingredients == null || ingredients.trim().isEmpty()) {

            pantryList.setText(
                    "Your pantry is empty.\n\n" +
                    "Add some ingredients to get started!"
            );

        } else {

            pantryList.setText(ingredients);
        }
    }
}

