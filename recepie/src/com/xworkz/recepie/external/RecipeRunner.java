package com.xworkz.recepie.external;

import com.xworkz.recepie.internal.Ingredient;
import com.xworkz.recepie.internal.Recipe;

public class RecipeRunner {
    public static void main(String[] args) {

        Ingredient pasta = new Ingredient("Spaghetti Pasta", 500.0);


        Recipe carbonara = new Recipe("Authentic Carbonara", 25, pasta);


        carbonara.displayRecipeDetails();
    }
}
