// Base interface
interface MealPlan {
    String getMealType();
    int getCalories();
}

// Meal types
class VegetarianMeal implements MealPlan {
    public String getMealType() {
        return "Vegetarian";
    }

    public int getCalories() {
        return 1800;
    }
}

class VeganMeal implements MealPlan {
    public String getMealType() {
        return "Vegan";
    }

    public int getCalories() {
        return 1600;
    }
}

class KetoMeal implements MealPlan {
    public String getMealType() {
        return "Keto";
    }

    public int getCalories() {
        return 2000;
    }
}

class HighProteinMeal implements MealPlan {
    public String getMealType() {
        return "High Protein";
    }

    public int getCalories() {
        return 2200;
    }
}

// Generic Meal class with bounded type
class Meal<T extends MealPlan> {
    T mealPlan;

    Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public void showMealDetails() {
        System.out.println(
            "Meal Type: " + mealPlan.getMealType() +
            ", Calories: " + mealPlan.getCalories()
        );
    }
}

// Utility class
class MealPlanGenerator {

    // Generic method
    public static <T extends MealPlan> Meal<T> generateMeal(T mealPlan) {
        if (mealPlan.getCalories() <= 2500) {
            return new Meal<>(mealPlan);
        }
        return null;
    }
}

public class PersonalizedMealPlanGenerator {

    public static void main(String[] args) {

        Meal<VegetarianMeal> vegMeal =MealPlanGenerator.generateMeal(new VegetarianMeal());

        Meal<VeganMeal> veganMeal =MealPlanGenerator.generateMeal(new VeganMeal());

        Meal<KetoMeal> ketoMeal =MealPlanGenerator.generateMeal(new KetoMeal());

        Meal<HighProteinMeal> proteinMeal =   MealPlanGenerator.generateMeal(new HighProteinMeal());

        System.out.println("Generated Meal Plans:\n");

        if (vegMeal != null) vegMeal.showMealDetails();
        if (veganMeal != null) veganMeal.showMealDetails();
        if (ketoMeal != null) ketoMeal.showMealDetails();
        if (proteinMeal != null) proteinMeal.showMealDetails();
    }
}
