
import java.util.Scanner;

public class SubTask3ForTask2 {
    public static void main(String[] args) {
        System.out.print("your numb : ");
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();
        int compNum = (int) Math.round(Math.random()*100 - 1);
        while (userNum != compNum) {
            if (userNum > compNum) {
                System.out.println("More than my num, tru again : ");
                userNum = scanner.nextInt();
            } else {
                System.out.println("Less than my num, tru again : ");
                userNum = scanner.nextInt();
            }
        }
        System.out.println("My congratulation, you guessed");

    }
}
