import java.lang.reflect.Array;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    public static final int DEFAULT_CAPACITY = 10;
    private Object elements[];
    public MyList(){
        elements = new Object[DEFAULT_CAPACITY];
    }
    private void ensuraCapa(){
        int newSize = elements.length*2;
        elements = Arrays.copyOf(elements, newSize);
    }
    public void add(E e){
        if (size == elements.length){
            ensuraCapa();
        }
        elements[size++] = e;
    }
    public E get(int i){
        if (i>= size || i< 0){
            throw new IndexOutOfBoundsException("index: "+ i + " Size "+ i);
        }
        return (E) elements[i];
    }
}
