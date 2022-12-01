
import java.util.ArrayList;

public class SubTask5 {
    public static String getTruthNums(int firstNum,int lastNum) 
    {
        int true1 = firstNum;
        ArrayList <Integer> truthNumbers = new ArrayList<>();
        while (true1 <= lastNum)
        {
            true1++;
            if(true1 % 2 == 0) 
            {
                if (true1 > lastNum)
                {
                    break;
                }
                truthNumbers.add(true1);
            }
        }
        return truthNumbers.toString();
    }
    
}
