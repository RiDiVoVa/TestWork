
public class SubTask3 {
    public static void main(int firstNum,int secondNum) {
        int higherDived = Math.min(firstNum, secondNum);
        for(int n = higherDived; n >= 1; n--){
            if (firstNum % n == 0 && secondNum % n == 0){
                higherDived = n;
                break;
            }
        }
        System.out.println("higher dived : " + higherDived);
    }
    
}
