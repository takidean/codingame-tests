
import java.util.EmptyStackException;

public class Stack {

    private Object [] elements;
    private int size = 0;

    public Stack(int initialCapacity) {
        this.elements = new Object[initialCapacity];
    }

    public void push(Object object) {
        this.ensureCapacity();
        this.elements[size++] = object;
    }


    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();
        System.out.println(size + " ****** " + elements.length);
        Object o=elements[--size];
        elements[size]=null;
        Object[] old=  elements;
        elements = new Object[size];
        System.arraycopy(old, 0, elements, 0, size);
        return o;
    }

    private void ensureCapacity() {

        if(elements.length == size) {

            Object [] old = elements;
            elements = new Object[2 * size + 1];
            System.arraycopy(old, 0, elements, 0, size);

            old=null;
        }
    }

    public static void main(String[] args) {
        //Before: show memory usage
        Stack stack = new Stack(10000);
        for(int i = 0; i < 10000; i++)
            stack.push("very large String: " + i);
        for(int i = 0; i < 10000; i++) {
            System.out.println(stack.pop());
        }
        // After: show memory usage
    }

}