package polymorphism;

public class MealTracker {

	public static void main(String[] args) {
		TrackerMeal tracker = new TrackerMeal();
		tracker.logMeal("Breakfast");
		tracker.logMeal("Lunch", 600);
		tracker.logMeal("Dinner", 800, "40% carbs, 30% protien, 30% fats");



	}

}

class TrackerMeal {
	
	// Method Overloading
	
	public void logMeal(String mealType) {
		System.out.println("Meal logged: " + mealType);
	}
	
	public void logMeal(String mealType, int calories) {
		System.out.println("Meal logged: " + mealType + " with " + calories + " calories");
	}
	
	public void logMeal(String mealType, int calories, String macros) {
		System.out.println("Meal logged: " + mealType + " with " + calories + " calories, macros: " + macros);
	}
}
