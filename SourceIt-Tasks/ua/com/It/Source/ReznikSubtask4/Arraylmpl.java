import java.util.Iterator;
class Arraylmpl implements Array {
    public Object[]array = new Object[10];

    @Override
    public void add(Object element) {
        array[10] = element;
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

    }
//TODO
//    @Override
//    public void remove(int index) {
//
//
//    }

    class Iteratorlmpl implements java.util.Iterator<Object> {
        @Override
        public boolean hasNext() {

            return false;
        }

        @Override
        public Object next() {
            return null;
        }

        @Override
        public void remove(){
            iterator().remove();
        }
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return 0;
    }

    public Iterator<Object> iterator(){
        return new Iteratorlmpl();
    }


    public void main(String[] args) {


    }
}





