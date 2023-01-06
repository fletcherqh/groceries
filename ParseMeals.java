import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;

public class ParseMeals {
    public ParseMeals() {
    }

    public static void parseMeals(ArrayList<String> list) {
        ArrayList<String> ingredientsList = List.readIngredients();
        for (String meal : list) {
            ArrayList<String> mealIngredientsList = List.readMeal(meal);
            
        }
    }
}