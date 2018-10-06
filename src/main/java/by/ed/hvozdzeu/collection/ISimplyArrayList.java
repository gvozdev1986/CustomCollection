package by.ed.hvozdzeu.collection;

/**
 * The interface for SimpleArray with main methods
 * for work with collection
 *
 * @param <E> parameterized item
 * @author Aliaksandr Hvozdzeu
 * @author <a href="mailto:aliaksandr.hvozdzeu@gmail.com">Aliaksandr Hvozdzeu</a>
 * @date 2018/10/05
 */
public interface ISimplyArrayList<E> extends Iterable<E> {

    /**
     * The method to add new item to array
     *
     * @param e parameterized item
     * @return boolean (true - suSccess / false - unsuccess)
     */
    boolean add(E e);

    /**
     * The method to delete item from array by id
     *
     * @param index int Index item in array
     */
    void delete(int index);

    /**
     * The method to get item by id
     *
     * @param index int Index item in array
     * @return E parameterized item
     */
    E get(int index);

    /**
     * The method to get first item
     *
     * @return E parameterized item
     */
    E getFirst();

    /**
     * The method to clear array
     */
    void clear();

    /**
     * The method to get last item
     *
     * @return E parameterized item
     */
    E getLast();

    /**
     * The method to getting size array
     *
     * @return int Amount items in array
     */
    int size();

    /**
     * The method to update item by id
     *
     * @param index int Index in array
     * @param e     e parameterized item
     */
    void update(int index, E e);

}
