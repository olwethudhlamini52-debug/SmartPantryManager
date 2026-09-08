package com.smartpantry.manager;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RecipeDetailActivity extends AppCompatActivity {

    private TextView recipeTitle;
    private TextView recipeTime;
    private TextView recipeServings;
    private TextView recipeIngredients;
    private TextView recipeInstructions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_recipe_detail);

        recipeTitle = findViewById(R.id.recipeTitle);
        recipeTime = findViewById(R.id.recipeTime);
        recipeServings = findViewById(R.id.recipeServings);
        recipeIngredients = findViewById(R.id.recipeIngredients);
        recipeInstructions = findViewById(R.id.recipeInstructions);

        String recipeName =
                getIntent().getStringExtra("recipeName");

        if (recipeName == null) {
            recipeName = "Recipe";
        }

        showRecipe(recipeName);
    }

    private void showRecipe(String recipeName) {

        switch (recipeName) {

            case "Egg Omelette":

                recipeTitle.setText("🍳 Egg Omelette");
                recipeTime.setText("⏱ Cooking Time: 10 minutes");
                recipeServings.setText("🍽 Servings: 1");
                recipeIngredients.setText(
                        "Ingredients:\n\n" +
                        "• 2 eggs\n" +
                        "• Salt\n" +
                        "• Black pepper\n" +
                        "• 1 teaspoon cooking oil"
                );

                recipeInstructions.setText(
                        "Instructions:\n\n" +
                        "1. Crack the eggs into a bowl.\n\n" +
                        "2. Add salt and pepper.\n\n" +
                        "3. Beat the eggs until combined.\n\n" +
                        "4. Heat oil in a pan.\n\n" +
                        "5. Pour the eggs into the pan.\n\n" +
                        "6. Cook until the eggs are set.\n\n" +
                        "7. Fold the omelette and serve."
                );
                break;

            case "Egg Sandwich":

                recipeTitle.setText("🥪 Egg Sandwich");
                recipeTime.setText("⏱ Cooking Time: 10 minutes");
                recipeServings.setText("🍽 Servings: 1");
                recipeIngredients.setText(
                        "Ingredients:\n\n" +
                        "• 2 eggs\n" +
                        "• 2 slices of bread\n" +
                        "• Salt\n" +
                        "• Black pepper"
                );

                recipeInstructions.setText(
                        "Instructions:\n\n" +
                        "1. Cook the eggs in a pan.\n\n" +
                        "2. Season with salt and pepper.\n\n" +
                        "3. Toast the bread if desired.\n\n" +
                        "4. Place the cooked eggs between the bread.\n\n" +
                        "5. Serve your sandwich."
                );
                break;

            case "Tomato & Egg":

                recipeTitle.setText("🍅 Tomato & Egg");
                recipeTime.setText("⏱ Cooking Time: 15 minutes");
                recipeServings.setText("🍽 Servings: 2");
                recipeIngredients.setText(
                        "Ingredients:\n\n" +
                        "• 2 eggs\n" +
                        "• 2 tomatoes\n" +
                        "• 1 onion\n" +
                        "• Salt\n" +
                        "• Cooking oil"
                );

                recipeInstructions.setText(
                        "Instructions:\n\n" +
                        "1. Chop the tomatoes and onion.\n\n" +
                        "2. Heat oil in a pan.\n\n" +
                        "3. Cook the onion and tomatoes.\n\n" +
                        "4. Add the eggs.\n\n" +
                        "5. Stir gently until the eggs are cooked.\n\n" +
                        "6. Season and serve."
                );
                break;

            case "Chicken & Rice":

                recipeTitle.setText("🍗 Chicken & Rice");
                recipeTime.setText("⏱ Cooking Time: 30 minutes");
                recipeServings.setText("🍽 Servings: 2");
                recipeIngredients.setText(
                        "Ingredients:\n\n" +
                        "• Chicken\n" +
                        "• Rice\n" +
                        "• Onion\n" +
                        "• Carrot\n" +
                        "• Salt\n" +
                        "• Cooking oil"
                );

                recipeInstructions.setText(
                        "Instructions:\n\n" +
                        "1. Cook the rice.\n\n" +
                        "2. Cut the chicken into pieces.\n\n" +
                        "3. Cook the chicken in a pan.\n\n" +
                        "4. Add onion and vegetables.\n\n" +
                        "5. Add the cooked rice.\n\n" +
                        "6. Mix everything together.\n\n" +
                        "7. Season and serve."
                );
                break;

            case "Potato & Egg":

                recipeTitle.setText("🥔 Potato & Egg");
                recipeTime.setText("⏱ Cooking Time: 20 minutes");
                recipeServings.setText("🍽 Servings: 2");
                recipeIngredients.setText(
                        "Ingredients:\n\n" +
                        "• 2 potatoes\n" +
                        "• 2 eggs\n" +
                        "• Salt\n" +
                        "• Black pepper\n" +
                        "• Cooking oil"
                );

                recipeInstructions.setText(
                        "Instructions:\n\n" +
                        "1. Peel and chop the potatoes.\n\n" +
                        "2. Fry the potatoes until soft.\n\n" +
                        "3. Add the eggs.\n\n" +
                        "4. Season with salt and pepper.\n\n" +
                        "5. Cook until the eggs are done.\n\n" +
                        "6. Serve hot."
                );
                break;

            case "Vegetable Fried Rice":

                recipeTitle.setText("🍚 Vegetable Fried Rice");
                recipeTime.setText("⏱ Cooking Time: 20 minutes");
                recipeServings.setText("🍽 Servings: 2");
                recipeIngredients.setText(
                        "Ingredients:\n\n" +
                        "• Cooked rice\n" +
                        "• Carrots\n" +
                        "• Peas\n" +
                        "• Onion\n" +
                        "• Cooking oil\n" +
                        "• Salt"
                );

                recipeInstructions.setText(
                        "Instructions:\n\n" +
                        "1. Heat oil in a pan.\n\n" +
                        "2. Add onion and vegetables.\n\n" +
                        "3. Cook until the vegetables are soft.\n\n" +
                        "4. Add the cooked rice.\n\n" +
                        "5. Mix everything together.\n\n" +
                        "6. Season and serve."
                );
                break;

            case "Grilled Cheese Sandwich":

                recipeTitle.setText("🧀 Grilled Cheese Sandwich");
                recipeTime.setText("⏱ Cooking Time: 10 minutes");
                recipeServings.setText("🍽 Servings: 1");
                recipeIngredients.setText(
                        "Ingredients:\n\n" +
                        "• 2 slices of bread\n" +
                        "• Cheese\n" +
                        "• Butter"
                );

                recipeInstructions.setText(
                        "Instructions:\n\n" +
                        "1. Butter the bread.\n\n" +
                        "2. Place cheese between the slices.\n\n" +
                        "3. Heat a pan.\n\n" +
                        "4. Grill both sides until golden brown.\n\n" +
                        "5. Serve hot."
                );
                break;

            case "Chicken & Potato":

                recipeTitle.setText("🍗 Chicken & Potato");
                recipeTime.setText("⏱ Cooking Time: 30 minutes");
                recipeServings.setText("🍽 Servings: 2");
                recipeIngredients.setText(
                        "Ingredients:\n\n" +
                        "• Chicken\n" +
                        "• Potatoes\n" +
                        "• Onion\n" +
                        "• Salt\n" +
                        "• Black pepper\n" +
                        "• Cooking oil"
                );

                recipeInstructions.setText(
                        "Instructions:\n\n" +
                        "1. Chop the potatoes.\n\n" +
                        "2. Cut the chicken into pieces.\n\n" +
                        "3. Heat oil in a pan.\n\n" +
                        "4. Cook the chicken.\n\n" +
                        "5. Add the potatoes and onion.\n\n" +
                        "6. Cook until everything is tender.\n\n" +
                        "7. Season and serve."
                );
                break;

            default:

                recipeTitle.setText(recipeName);
                recipeTime.setText("⏱ Cooking Time: Not available");
                recipeServings.setText("🍽 Servings: Not available");
                recipeIngredients.setText(
                        "Ingredients information is not available."
                );
                recipeInstructions.setText(
                        "Instructions are not available for this recipe yet."
                );
                break;
        }
    }
}