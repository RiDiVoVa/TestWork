public class SubTask2ForTask3 {
    public static void main(String[] args) {
        String l = "Данный раздел посвящен языку программирования Java и всем сопутствующим технологиям. Java на сегодняшний день являетсясамым популярным языком программирования, который позволяет создавать различные приложения широкого спектра: веб-сайты и веб-сервисы, десктопные программы, мобильные приложения для ОС Андроид, современные приложения с богатым интерфейсом (Java FX)";



        int counter = 0;
        String[] sym = l.split("");

        for (int i = 0; i <sym.length ; i+=3) {
            sym[i] = "#";
        }
        for (int i = 1; i <sym.length ; i+=3) {
            sym[i] = "$";
        }
        for (int i = 2; i <sym.length ; i+=3) {
            sym[i] = "@";
        }
        for (int i = 0; i <sym.length ; i++) {
            System.out.print(sym[i]);
        }
    }
}
