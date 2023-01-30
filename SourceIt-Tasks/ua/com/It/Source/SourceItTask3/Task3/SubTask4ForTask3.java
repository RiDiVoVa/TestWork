import java.util.ArrayList;
public class SubTask4ForTask3 {
    public static void main(String[] args) {
        String startText = "i love java very much";
        String[] words = startText.split(" ");

        ArrayList<String> textWIthoutChanges = new ArrayList<>();
        ArrayList<String> textWithChanges = new ArrayList<>();

        for (int i = 0; i < words.length; i++) {
            textWIthoutChanges.add(words[i]);
        }

        String s = textWIthoutChanges.get(textWIthoutChanges.size() - 1);
        textWithChanges.add(0,s);
        for (int i = 1; i < textWIthoutChanges.size(); i++) {
            textWithChanges.add(i,textWIthoutChanges.get(i-1));
        }
        System.out.println("Text without changes : " + textWIthoutChanges.toString());
        System.out.println("Text with changes : " + textWithChanges.toString());

    }
}
