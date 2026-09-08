package com.smartpantry.manager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class RecipesActivity extends AppCompatActivity {

    private LinearLayout recipeContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_recipes);

        recipeContainer = findViewById(R.id.recipeContainer);

        findRecipes();
    }

    private void findRecipes() {

        SharedPreferences preferences =
                getSharedPreferences("PantryData", MODE_PRIVATE);

        String ingredients =
                preferences.getString("ingredients", "");

        if (ingredients == null ||
                ingredients.trim().isEmpty()) {

            showMessage(
                    "No ingredients found.\n\n" +
                    "Please add ingredients to your pantry first."
            );

            return;
        }

        String pantry =
                ingredients.toLowerCase(Locale.ROOT);

        boolean foundRecipe = false;

        // Egg Omelette
        if (pantry.contains("egg")) {

            addRecipe(
                    "🍳 Egg Omelette",
                    "A quick and easy breakfast made with eggs.",
                    "Egg Omelette"
            );

            foundRecipe = true;
        }

        // Egg Sandwich
        if (pantry.contains("egg") &&
                pantry.contains("bread")) {

            addRecipe(
                    "🥪 Egg Sandwich",
                    "A simple sandwich made with eggs and bread.",
                    "Egg Sandwich"
            );

            foundRecipe = true;
        }

        // Tomato & Egg
        if (pantry.contains("tomato") &&
                pantry.contains("egg")) {

            addRecipe(
                    "🍅 Tomato & Egg",
                    "A simple and tasty tomato and egg meal.",
                    "Tomato & Egg"
            );

            foundRecipe = true;
        }

        // Chicken & Rice
        if (pantry.contains("chicken") &&
                pantry.contains("rice")) {

            addRecipe(
                    "🍗 Chicken & Rice",
                    "A filling family meal using chicken and rice.",
                    "Chicken & Rice"
            );

            foundRecipe = true;
        }

        // Potato & Egg
        if (pantry.contains("potato") &&
                pantry.contains("egg")) {

            addRecipe(
                    "🥔 Potato & Egg",
                    "A simple homemade potato and egg meal.",
                    "Potato & Egg"
            );

            foundRecipe = true;
        }

        // Vegetable Fried Rice
        if (pantry.contains("rice") &&
                (pantry.contains("carrot") ||
                 pantry.contains("peas") ||
                 pantry.contains("onion"))) {

            addRecipe(
                    "🍚 Vegetable Fried Rice",
                    "A great way to use leftover vegetables and rice.",
                    "Vegetable Fried Rice"
            );

            foundRecipe = true;
        }

        // Grilled Cheese
        if (pantry.contains("bread") &&
                pantry.contains("cheese")) {

            addRecipe(
                    "🧀 Grilled Cheese Sandwich",
                    "A quick and delicious toasted cheese sandwich.",
                    "Grilled Cheese Sandwich"
            );

            foundRecipe = true;
        }

        // Chicken & Potato
        if (pantry.contains("chicken") &&
                pantry.contains("potato")) {

            addRecipe(
                    "🍗 Chicken & Potato",
                    "A hearty homemade chicken and potato dinner.",
                    "Chicken & Potato"
            );

            foundRecipe = true;
        }

        if (!foundRecipe) {

            showMessage(
                    "No matching recipes found.\n\n" +
                    "Try adding ingredients such as:\n\n" +
                    "Eggs\n" +
                    "Bread\n" +
                    "Tomatoes\n" +
                    "Chicken\n" +
                    "Rice\n" +
                    "Potatoes\n" +
                    "Cheese\n" +
                    "Onions\n" +
                    "Carrots\n" +
                    "Peas"
            );
        }
    }

    private void addRecipe(
            String title,
            String description,
            String recipeName) {

        LinearLayout card =
                new LinearLayout(this);

        card.setOrientation(LinearLayout.VERTICAL);

        card.setPadding(
                20,
                20,
                20,
                20
        );

        LinearLayout.LayoutParams cardParams =
                new LinearLayout.LayoutParams(
                        ViewGroup.LayoutParams.MATCH_PARENT,
                        ViewGroup.LayoutParams.WRAP_CONTENT
                );

        cardParams.setMargins(
                0,
                0,
                0,
                20
        );

        card.setLayoutParams(cardParams);

        TextView titleText =
                new TextView(this);

        titleText.setText(title);

        titleText.setTextSize(22);

        titleText.setTypeface(
                null,
                Typeface.BOLD
        );

        TextView descriptionText =
                new TextView(this);

        descriptionText.setText(description);

        descriptionText.setTextSize(16);

        descriptionText.setPadding(
                0,
                10,
                0,
                10
        );

        Button viewButton =
                new Button(this);

        viewButton.setText("View Recipe");

        viewButton.setOnClickListener(v -> {

            Intent intent =
                    new Intent(
                            RecipesActivity.this,
                            RecipeDetailActivity.class
                    );

            intent.putExtra(
                    "recipeName",
                    recipeName
            );

            startActivity(intent);
        });

        card.addView(titleText);

        card.addView(descriptionText);

        card.addView(viewButton);

        recipeContainer.addView(card);
    }

    private void showMessage(String message) {

        TextView messageText =
                new TextView(this);

        messageText.setText(message);

        messageText.setTextSize(18);

        recipeContainer.addView(messageText);
    }
}