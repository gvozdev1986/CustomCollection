package by.ed.hvozdzeu.collection.arraylist;

import by.ed.hvozdzeu.collection.Simply;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * The test SimpleArray collection
 */
public class SimplyArrayTest {

    /**
     * Create SimpleArray
     */
    private Simply<String> stringSimply;

    @Before
    public void setUp() {
        stringSimply = new SimplyArray<String>();
    }

    @Test
    public void addString() {
        /*
        Add items to SimplyArray
         */
        stringSimply.add("one");
        stringSimply.add("two");
        stringSimply.add("tree");

        /*
        Check then not null and size equals
         */
        assertNotNull(stringSimply);
        assertEquals(3, stringSimply.size());
    }

    @Test
    public void deleteByIndex() {
        /*
        Add items to SimplyArray
         */
        stringSimply.add("one");
        stringSimply.add("two");
        stringSimply.add("tree");

        /*
        Delete item from SimplyArray
         */
        stringSimply.delete(2);

        /*
        Check then not null and size equals
         */
        assertNotNull(stringSimply);
        assertEquals(2, stringSimply.size());
    }

    @Test
    public void getByIndex() {
        /*
        Add items to SimplyArray
         */
        stringSimply.add("one");
        stringSimply.add("two");
        stringSimply.add("tree");

        /*
        Get item by item id
         */
        stringSimply.get(2);

        /*
        Check then not null and size equals
         */
        assertNotNull(stringSimply);
        assertEquals("tree", stringSimply.get(2));
    }

    @Test
    public void sizeArray() {
        /*
        Add items to SimplyArray
         */
        stringSimply.add("one");
        stringSimply.add("two");
        stringSimply.add("tree");

        /*
        Get size simple array
         */
        stringSimply.size();

        /*
        Check then not null, not equals 0 and size equals
         */
        assertNotNull(stringSimply);
        assertNotEquals(0, stringSimply.size());
        assertEquals(3, stringSimply.size());
    }

    @Test
    public void updateByIndex() {
        /*
        Add items to SimplyArray
         */
        stringSimply.add("one");
        stringSimply.add("two");
        stringSimply.add("tree");

        /*
        Update item by id
         */
        stringSimply.update(2, "tree-tree");

        /*
        Check then not null and item equals item after update
         */
        assertNotNull(stringSimply);
        assertEquals("tree-tree", stringSimply.get(2));
    }

    /*
    Negative test, delete item when array is empty
     */
    @Test(expected = NegativeArraySizeException.class)
    public void deleteItem_whenArraySizeZero(){
        stringSimply.delete(1);
    }

    /*
    Negative test, get item when array is empty
     */
    @Test(expected = NegativeArraySizeException.class)
    public void getItem_whenArraySizeZero(){
        stringSimply.delete(1);
    }

    /*
    Negative test, update item when array is empty
     */
    @Test(expected = NegativeArraySizeException.class)
    public void updateItem_whenArraySizeZero(){
        stringSimply.delete(1);
    }

}