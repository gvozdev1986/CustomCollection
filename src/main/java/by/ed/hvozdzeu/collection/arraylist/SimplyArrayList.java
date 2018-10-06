package by.ed.hvozdzeu.collection.arraylist;

import by.ed.hvozdzeu.collection.ISimplyArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * The class with realization ISimplyArrayList
 *
 * @date   2018/10/05
 * @param <E> parameterized item
 * @author Aliaksandr Hvozdzeu
 * @author <a href="mailto:aliaksandr.hvozdzeu@gmail.com">Aliaksandr Hvozdzeu</a>
 */
public class SimplyArrayList<E> implements ISimplyArrayList<E> {

    /**
     * Initial array
     */
    private E[] values;

    /**
     * Constructor initialization 0 size array
     */
    SimplyArrayList() {
        values = (E[]) new Object[0];
    }

    /**
     * The method to add new item to array
     *
     * @param e parameterized item
     * @return boolean (true - success / false - unsuccess)
     */
    @Override
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
     * The method to delete item from array by id
     *
     * @param index int Index item in array
     */
    @Override
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
     * The method to get item by id
     *
     * @param index int Index item in array
     * @return E parameterized item
     */
    @Override
    public E get(int index) {
        return values[index];
    }

    /**
     * The method to get first item
     * @return E parameterized item
     */
    @Override
    public E getFirst() {
        return values[0];
    }

    /**
     * Method to clean the array but leaves cells with a value of null.
     */
    @Override
    public void clear() {
        for (int i = 0; i < values.length; i++)
            values[i] = null;
    }

    /**
     * The method to get last item
     * @return E parameterized item
     */
    @Override
    public E getLast() {
        return values[values.length - 1];
    }

    /**
     * The method to getting size array
     *
     * @return int Amount items in array
     */
    @Override
    public int size() {
        return values.length;
    }

    /**
     * The method to update item by id
     *
     * @param index int Index in array
     * @param e     e parameterized item
     */
    @Override
    public void update(int index, E e) {
        values[index] = e;
    }

    /**
     * The iterator method to Iterator<E>
     *
     * @return Iterator<E>
     */
    @Override
    public Iterator<E> iterator() {
        return new ArrayIterator<>(values);
    }


}
