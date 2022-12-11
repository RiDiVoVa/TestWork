

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubTask2ForTask2 {
    public static int substrCount(String input,String needle,int ofset,int lenth) 
    {
        StringBuffer strBuff = new StringBuffer(input);
        String input2 = strBuff.substring(ofset, lenth);
        Pattern pattern = Pattern.compile(needle);
         Matcher matcher = pattern.matcher(input2);
        int counter = 0;
        for (int i = 0; i < input2.length(); i++) {
            if (matcher.find()){
                ++counter;
            }
        }
        return counter;
    }
    
    
    
}
