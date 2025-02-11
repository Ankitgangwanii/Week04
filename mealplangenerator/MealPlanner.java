package com.tit.mealplangenerator;

import java.util.ArrayList;
import java.util.List;

public class MealPlanner {
    public static void main(String[] args) {
        List<Meal<? extends MealPlan>> mealPlans = new ArrayList<>();

        mealPlans.add(new Meal<>("Grilled Veggies", new VegetarianMeal()));
        mealPlans.add(new Meal<>("Tofu Stir-Fry", new VeganMeal()));
        mealPlans.add(new Meal<>("Avocado Salad", new KetoMeal()));
        mealPlans.add(new Meal<>("Chicken Breast", new HighProteinMeal()));

        System.out.println("Generated meal plan: \n");

        for (Meal<? extends MealPlan> meal : mealPlans) {
            System.out.println( meal);
        }
    }
}
