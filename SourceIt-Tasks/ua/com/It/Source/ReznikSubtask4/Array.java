public interface Array extends Container {
    String toString();
    void add(Object element, int i);
    void set(int index, Object element);
    Object get(int index);
    int indexOf(Object element);
    void remove(int index);
}

