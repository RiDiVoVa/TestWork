
import java.util.ArrayList;

public class SubTask5 {
    public static void main(String[] args) {
        int firstNum = Integer.parseInt(args[0]);
        int lastNum  = Integer.parseInt(args[1]);
        int true1 = firstNum;
        ArrayList <Integer> truthNumbers = new ArrayList<>();
        while (true1 <= lastNum){
            true1++;
            if(true1 % 2 == 0) {
                if (true1 > lastNum){
                    break;
                }
                truthNumbers.add(true1);
            }
        }
        System.out.println(truthNumbers.toString());
    }
    
}
