package com.smartpantry.manager;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button addIngredientButton =
                findViewById(R.id.addIngredientButton);

        Button viewPantryButton =
                findViewById(R.id.viewPantryButton);

        Button findRecipesButton =
                findViewById(R.id.findRecipesButton);

        addIngredientButton.setOnClickListener(v -> {

            Intent intent = new Intent(
                    MainActivity.this,
                    AddIngredientActivity.class
            );

            startActivity(intent);
        });

        viewPantryButton.setOnClickListener(v -> {

            Intent intent = new Intent(
                    MainActivity.this,
                    PantryActivity.class
            );

            startActivity(intent);
        });

        findRecipesButton.setOnClickListener(v -> {

            Intent intent = new Intent(
                    MainActivity.this,
                    RecipesActivity.class
            );

            startActivity(intent);
        });
    }
}

