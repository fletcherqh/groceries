import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;

public class List {
    public static void printList() { //print contents of ingredients
        try {
            Scanner listScanner = new Scanner(new File("ingredients.txt"));

            while (listScanner.hasNext()) {
                System.out.println(listScanner.nextLine());
            }
        }
        catch (Exception e) {
        }
    }

    public static ArrayList<String> readIngredients() { //return contents of ingredients as ArrayList
        try {
            Scanner listScanner = new Scanner(new File("ingredients.txt"));
            ArrayList<String> ingredientsList = new ArrayList<>();

            while (listScanner.hasNext()) {
                ingredientsList.add(listScanner.nextLine());
            }
            return ingredientsList;
        }
        catch (Exception e) {
            return new ArrayList<String>();
        }
    }

    public static ArrayList<String> readMeal(String filename) { //return ingredients in specified recipie as ArrayList
        try {
            Scanner listScanner = new Scanner(new File("recipies/" + filename + ".txt"));
            ArrayList<String> mealIngredientsList = new ArrayList<>();

            while (listScanner.hasNext()) {
                mealIngredientsList.add(listScanner.nextLine());
            }
            return mealIngredientsList;
        }
        catch (Exception e) {
            System.out.println("Meal not found");
            return new ArrayList<String>();
        }
    }
}