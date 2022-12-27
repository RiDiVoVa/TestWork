
public class Demo {
    public static void main(String[] args) {
        // Subtask 1
        System.out.printf("Sum is %.1f", SubTask1.getSum(1.1, 1.55));
        System.out.println();
        
        // Subtask 2
        System.out.println(SubTask2.getTrim("   HHH ggggg   "));

        // Subtask 3
        System.out.println("higher dived : " + SubTask3.getHigherDived(8, 12));
        
        // Subtask 4
        System.out.println("Sum of yuor digit is : " + SubTask4.getSumOfDigits(1111));

        // Subtask 5
        System.out.println("Truth nums is : " + SubTask5.getTruthNums(45, 100));
        // Subtask 6
        System.out.println(SubTask6.getSerialNumb("AAA"));
        System.out.println(SubTask6.getLetters(277));
        System.out.println(SubTask6.getSerialNumbPlusOne("AAA"));
    }
}
