import java.util.Iterator;
interface Container extends Iterable<Object>{
    void clear();
    int size();
    String toString();
    Iterator<Object> iterator();
}

