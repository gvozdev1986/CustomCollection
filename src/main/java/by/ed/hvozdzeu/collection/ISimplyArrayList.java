package by.ed.hvozdzeu.collection;

/**
 * The interface for SimpleArray with main methods
 * for work with collection
 *
 * @date   2018/10/05
 * @author Aliaksandr Hvozdzeu
 * @author <a href="mailto:aliaksandr.hvozdzeu@gmail.com">Aliaksandr Hvozdzeu</a>
 * @param <E> parameterized item
 */
public interface ISimplyArrayList<E> extends Iterable<E> {

    /**
     * The method for add new item to array
     *
     * @param e parameterized item
     * @return boolean (true - suSccess / false - unsuccess)
     */
    boolean add(E e);

    /**
     * The method for delete item from array by id
     *
     * @param index int Index item in array
     */
    void delete(int index);

    /**
     * The method for get item by id
     *
     * @param index int Index item in array
     * @return E parameterized item
     */
    E get(int index);

    /**
     * The method for getting size array
     *
     * @return int Amount items in array
     */
    int size();

    /**
     * The method for update item by id
     *
     * @param index int Index in array
     * @param e e parameterized item
     */
    void update(int index, E e);

}
