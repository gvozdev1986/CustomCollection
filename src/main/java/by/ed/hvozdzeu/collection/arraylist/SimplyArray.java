package by.ed.hvozdzeu.collection.arraylist;

import by.ed.hvozdzeu.collection.Simply;

import java.util.Iterator;

/**
 * The class with realization SimplyArray
 *
 * @date   2018/10/05
 * @param <E> parameterized item
 * @author Aliaksandr Hvozdzeu
 * @author <a href="mailto:aliaksandr.hvozdzeu@gmail.com">Aliaksandr Hvozdzeu</a>
 */
public class SimplyArray<E> implements Simply<E> {

    /**
     * Initial array
     */
    private E[] values;

    /**
     * Constructor initialization 0 size array
     */
    SimplyArray() {
        values = (E[]) new Object[0];
    }

    /**
     * The method for add new item to array
     *
     * @param e parameterized item
     * @return boolean (true - success / false - unsuccess)
     */
    public boolean add(E e) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length + 1];
            System.arraycopy(
                    temp,
                    0,
                    values,
                    0,
                    temp.length
            );
            values[values.length - 1] = e;
            return true;
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    /**
     * The method for delete item from array by id
     *
     * @param index int Index item in array
     */
    public void delete(int index) {
        try {
            E[] temp = values;
            values = (E[]) new Object[temp.length - 1];
            System.arraycopy(
                    temp,
                    0,
                    values,
                    0, index
            );
            int amountElementsAfterIndex = temp.length - index - 1;
            System.arraycopy(
                    temp,
                    index + 1,
                    values,
                    index,
                    amountElementsAfterIndex
            );
        } catch (ClassCastException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * The method for get item by id
     *
     * @param index int Index item in array
     * @return E parameterized item
     */
    public E get(int index) {
        return values[index];
    }

    /**
     * The method for getting size array
     *
     * @return int Amount items in array
     */
    public int size() {
        return values.length;
    }

    /**
     * The method for update item by id
     *
     * @param index int Index in array
     * @param e     e parameterized item
     */
    public void update(int index, E e) {
        values[index] = e;
    }

    /**
     * The iterator method for Iterator<E>
     *
     * @return Iterator<E>
     */
    public Iterator<E> iterator() {
        return new ArrayIterator<E>(values);
    }


}
