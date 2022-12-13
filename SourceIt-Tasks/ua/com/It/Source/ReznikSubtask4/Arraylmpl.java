import java.util.Iterator;

public class Arraylmpl implements Array {
    public Object[]array = new Object[3];
    public static void main(String[] args) {
        Arraylmpl m = new Arraylmpl();
        m.add("A",0);
        m.add("B",1);
        m.add("C",2);

        Iterator<Object> b = m.iterator();
        while (b.hasNext()){
            System.out.print(b.next() + " ");
        }
        System.out.println();
        System.out.println("-----------------");


        b.remove();
        System.out.println("remove");
        System.out.println(m.toString());
        System.out.println("-----------------");

        //set positions of elements
        m.set(0,"C");
        m.set(1,"B");
        m.set(2,"A");

        System.out.println(m.toString());
        System.out.println("-----------------");

        System.out.println("get Obj by index");
        System.out.println(m.get(1));
        System.out.println("-----------------");

        System.out.println("indexOf");
        System.out.println(m.indexOf("B"));
        System.out.println("-----------------");

        m.remove(1);
        System.out.println("remove by index");
        System.out.println(m.toString());
        System.out.println("-----------------");

        m.clear();
        System.out.println("clear");
        System.out.println(m.toString());
        System.out.println("-----------------");

        System.out.println("size");
        System.out.println(m.size());
        System.out.println("-----------------");

    }

   @Override
    public String toString(){

       StringBuilder strB = new StringBuilder();
       for (int i = 0; i < array.length; i++) {
           strB.append(array[i]);
           strB.append(",");
       }
       strB.deleteCharAt(strB.length()-1);
       String v = "["+ strB.toString()+"]";
       return v;
   }

    @Override
    public void add( Object element,int i) {

        array[i] = element;
    }

    @Override
    public void set(int index, Object element) {

        array[index] = element;
    }

    @Override
    public Object get(int index) {
        return array[index];
    }

    @Override
    public int indexOf(Object element) {
        if (array[1].equals(element)){
            return 1;
        } else {
            return -1;
        }
    }

    @Override
    public void remove(int index) {
        array[index] = null;
    }

    @Override
    public void clear() {
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
    }

    @Override
    public int size() {
        return array.length;
    }

    @Override
    public Iterator<Object> iterator(){
        return new Iteratorlmpl();
    }

    public class Iteratorlmpl implements java.util.Iterator<Object> {
       private int i = 0;

        @Override
        public boolean hasNext() {
            return array.length>i;
        }

        @Override
        public Object next() {
            return String.valueOf(array[i++]);
        }

        @Override
        public void remove(){
            for (int j = 0; j < array.length; j++) {
                array[j] = null;
            }

        }
    }
}