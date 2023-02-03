import java.io.*;
import java.util.Arrays;

public class SubTask1ForTask5 {
    public static void main(String[] args) {
        String textFromDataTxt;
        String[] arrayString;
        int[]arrINT;

        int[] array = new int[20];
        for (int i = 0; i < array.length ; i++) {
            array[i] = (int) (Math.random()*52);
        }

        FileCreator bob = new FileCreator();
        bob.CreateFile(array);//input unsorted array for filling the file

        Remake remake = new Remake();//the object,for writing sorted values to second file


        //read from the first file
        try (BufferedReader reader = new BufferedReader(new FileReader("C://data.txt")))  {
            textFromDataTxt = reader.readLine();


            arrayString = textFromDataTxt.split(" ") ;
            arrINT = new int[arrayString.length];


            //перевод стрингового масива в инт для сортировки
            arrINT = bob.changeArr(arrayString);


            //Sorted by "Bubble sort"
            arrINT = bob.BubbleSort(arrINT);



        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        remake.RemakeFile(arrINT);

        System.out.print("Input  ===> ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }

        System.out.println();

        System.out.print("Output  ===> ");
        for (int i = 0; i < arrINT.length; i++) {
            System.out.print(arrINT[i] + " ");

        }


    }
}


//create the file,and full it values
class FileCreator {
    public void CreateFile(int [] array){

        try (final FileWriter writer = new FileWriter("C://data.txt", false))
        {
            for (int i = 0; i < array.length; ++i)
            {
                final String s = Integer.toString(array[i]);
                writer.write(s + " ");

            }
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public int[] changeArr(String[] arrayString){
        int[]arInt = new int[arrayString.length];
        for (int i = 0; i < arrayString.length; i++)
        {
            arInt[i] = Integer.parseInt(arrayString[i]);
        }
        return arInt;
    }

    public int[] BubbleSort(int[]arInt){
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arInt.length - 1; i++) {
                if (arInt[i] > arInt[i + 1]) {
                    isSorted = false;

                    buf = arInt[i];
                    arInt[i] = arInt[i + 1];
                    arInt[i + 1] = buf;
                }
            }
        }
        return arInt;
    }

}
class Remake {
    public void RemakeFile(int[]array){

        try (final FileWriter writer = new FileWriter("C://data_sorted.txt", false))
        {
            for (int i = 0; i < array.length; ++i)
            {
                final String s = Integer.toString(array[i]);
                writer.write(s + " ");

            }
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

}

