package ua.com.It.Source.Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ProgramTest {
    public static int counter = 0;
    public static boolean truth;
    public static String input = "[[]]";
    public static StringBuffer strBuff = new StringBuffer(input);
    public static String input2 = "";
    //TODO надо обяснить ему как выходить из цикла он находит совпадение ставит тру и просто гоняется по циклу
    // можно попробовать удалять символи которые он нашел и сопоставил
    //yyyy

    public static void main(String[] args) {
        
        String[]charsinputArray = input.split("");
        
        
            for (int i = 0; i < charsinputArray.length; i++) {
                
            
                if (charsinputArray[0].equals(")") || charsinputArray[0].equals("]") || charsinputArray[0].equals("}")) {
                    System.out.println("by");
                    break;
                } 
                System.out.println("enter to a loop");

                if (charsinputArray[i].equals("(")) {
                   
                    System.out.println( "gggg" +input2);
                    if((truth = ProgramTest.get1("\\)", input2)) != true) {
                        System.out.println("33 trouble 33");
                        break;
                        
                    }
                    
                    
                }
                
                
                if (charsinputArray[i].equals("[")) {
                    System.out.println("i am here");
                    
                    if((truth = ProgramTest.get1("\\]", input2)) == false){
                        System.out.println("11trouble11");
                        break;
                        
                    }
                    
                    
                    // truth =  ProgramTest.get1("]", input);
                }
                

                if (charsinputArray[i].equals("{")){
                    
                    if((truth = ProgramTest.get1("\\}", input2)) == false){
                        System.out.println("22trouble22");
                        break;
                        
                    }
                
                    
                    //    truth =  ProgramTest.get1("}", input);

                }
                input2 = strBuff.substring(i+1);    
                //truth = false;
                
            }
           
        System.out.println("the end answer   " + truth);
    } 
           


    public static boolean get1 (String nested, String inputIn) {
        Pattern pattern = Pattern.compile(nested);
        Matcher matcher = pattern.matcher(inputIn);
        boolean back;
        while(matcher.find()){
            ++counter;
            System.out.println(nested + " 333 " + counter);
            
            if(counter == 1){
                truth = true;
                System.out.println(nested + " 111 " + truth);
                break;
            } else {
                truth = false;
                System.out.println(nested + "  2222 "  + truth);
                break;
            }
        }
        back = truth;
        System.out.println("mmmmmmmmmmmm " + back);
        counter = 0;
        return back;

    }
        
}