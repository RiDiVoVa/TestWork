import java.util.*;
public class SubTask3ForTask3 {
    private static class MyClass implements Comparator<String> {
        private char letter;

        MyClass(char l)
        {
            letter = l;
        }

        int matchesCount(String s)
        {
            int found = 0;

            for ( char c : s.toCharArray() )
            {
                if ( letter == c )
                    ++found;
            }
            return found;
        }

        public int compare(String a, String b)
        {
            int compatre = matchesCount(a) - matchesCount(b);
            return ( compatre != 0 ) ? compatre : a.compareTo(b);
        }
    }

    public static void main(String[] args)
    {
        String s = "i looove hoor soon";
        char findCHar = 'o';
        String[] words = s.split(" ");
        Arrays.sort(words, new MyClass(findCHar));
        for ( String w : words )
            System.out.println(w);

    }
}
