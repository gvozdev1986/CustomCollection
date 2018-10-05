package by.ed.hvozdzeu.collection.arraylist;

import java.util.Iterator;

/**
 * The class iterator extended Iterator<E>>
 *
 * @date   2018/10/05
 * @param <E> parameterized item
 * @author Aliaksandr Hvozdzeu
 * @author <a href="mailto:aliaksandr.hvozdzeu@gmail.com">Aliaksandr Hvozdzeu</a>
 */
public class ArrayIterator<E> implements Iterator<E> {

    /**
     * Initial index
     */
    private int index = 0;

    /**
     * Initial array
     */
    private E[] values;

    /**
     * Constructor initialization array
     *
     * @param values empty array
     */
    ArrayIterator(E[] values) {
        this.values = values;
    }

    /**
     * Method to go through the array by item
     *
     * @return true if array has next item, false if array has not next item
     */
    public boolean hasNext() {
        return index < values.length;
    }

    /**
     * Method to go to the next item
     *
     * @return <E> parameterized item
     */
    public E next() {
        return values[index++];
    }

    /**
     * Unsupported method
     */
    public void remove() {
        throw new UnsupportedOperationException("remove");
    }

}
