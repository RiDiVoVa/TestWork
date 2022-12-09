

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class SubTask1ForTask2 {
    public static boolean truth;
    public static boolean testString(String input) {
        ArrayList<String> charsinputArray = new ArrayList<>(List.of(input.split("")));
        for (int i = 0; i < charsinputArray.size(); i++) {
            if (charsinputArray.get(i).equals("("))
            {
                truth = answerCloseBracets(")",charsinputArray);
                charsinputArray.set(i,"1");
            }
            if (charsinputArray.get(i).equals("["))
            {
                truth = answerCloseBracets("]",charsinputArray);
                charsinputArray.set(i,"1");
            }
            if (charsinputArray.get(i).equals("{"))
            {
                truth = answerCloseBracets("}",charsinputArray);
                charsinputArray.set(i,"1");
            }
            if (!truth){break;}
        }
        return truth;
    }
    public static boolean answerCloseBracets(String nested,ArrayList<String> k){
        boolean answerForBracets = false;
        for (int i = 0; i < k.size(); i++)
        {
            if (k.get(i).equals(nested))
            {
                k.remove(i);
                answerForBracets = true;
                break;
            }
        }
        return answerForBracets;
    }
}

