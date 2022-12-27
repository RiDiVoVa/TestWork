
public class SubTask6 {
    public static int getSerialNumb(String letter) { 
        int b = 0; 
        for (int i = 0; i < letter.length();i++) 
        { 
            b *= 26; 
            b += letter.charAt(i) - 'A' + 1; 
        } 
        return b; 
    } 
    public static String getLetters(int input) {  
        StringBuffer n = new StringBuffer(); 
        while(input!=0) 
        { 
            input--; 
            n.append((char)('A' + (input % 26))); 
            input /= 26; 
        }   
        return n.reverse().toString(); 
    } 
    public static int getSerialNumbPlusOne(String getLetters) { 
        return getSerialNumb(getLetters) + 1; 
    }
    
}
