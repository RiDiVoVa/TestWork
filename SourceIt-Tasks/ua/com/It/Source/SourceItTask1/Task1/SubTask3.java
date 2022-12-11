
public class SubTask3 {
    public static int getHigherDived (int firstNum,int secondNum) 
    {
        int higherDived = Math.min(firstNum, secondNum);
        for(int n = higherDived; n >= 1; n--)
        {
            if (firstNum % n == 0 && secondNum % n == 0)
            {
                higherDived = n;
                break;
            }
        }
        return higherDived;
        
    }
    
}
