import java.util.Scanner;
import java.util.ArrayList;

public class Groceries {
    public Groceries() {

    }

    public static void main(String[] args) {
        if (args[0].equals("list")) {
            List.printList();
        }
        else if(args[0].equals("add")) {
            Add.add(args[1], "ingredients");
        }
        else if(args[0].equals("meals")) {
            Scanner sc = new Scanner(System.in);
            ArrayList<String> shoppingList = new ArrayList<>();

            while (sc.next().equals("stop") == false) {
                shoppingList.add(sc.next());
            }

            for (String meal : shoppingList) {
                System.out.println(meal);
            }
        }
    }
}