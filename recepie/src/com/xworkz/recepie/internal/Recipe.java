package com.xworkz.recepie.internal;

public class Recipe {
    public String recipeName;
    public int prepTimeMinutes;
    public Ingredient mainIngredient; // Composition: Recipe "has-a" Ingredient

    public Recipe(String recipeName, int prepTimeMinutes, Ingredient mainIngredient) {
        this.recipeName = recipeName;
        this.prepTimeMinutes = prepTimeMinutes;
        this.mainIngredient = mainIngredient;
    }

    public void displayRecipeDetails() {
        System.out.println("Recipe Name: " + recipeName);
        System.out.println("Preparation Time: " + prepTimeMinutes + " minutes");

        System.out.println("Main Ingredient: " + mainIngredient.ingredientName);
        System.out.println("Quantity Required: " + mainIngredient.quantityGrams + " grams");
    }
}