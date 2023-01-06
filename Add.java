import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.File;

public class Add {
    public static void add(String item, String filepath) {
        try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(filepath + ".txt", true)))) {
            out.println(item);
        } catch (Exception e) {
        }
    }
}