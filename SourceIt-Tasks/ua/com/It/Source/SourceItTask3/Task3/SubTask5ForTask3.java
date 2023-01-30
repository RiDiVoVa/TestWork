import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SubTask5ForTask3 {
    public static void main(String[] args) {

        //не розобрался как сделать перенос слов  взависимости от даного количества

        try (Scanner sc = new Scanner(new File("C:\\Users\\UNIVERSE\\input.txt"));
             FileWriter writer = new FileWriter(new File("C:\\Users\\UNIVERSE\\output.txt"))) {
            while (sc.hasNextLine()) {
                writer.write(String.format("%50s\n", sc.nextLine()));
            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
