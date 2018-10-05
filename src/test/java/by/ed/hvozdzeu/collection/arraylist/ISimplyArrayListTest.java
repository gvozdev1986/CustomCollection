package by.ed.hvozdzeu.collection.arraylist;

import by.ed.hvozdzeu.collection.ISimplyArrayList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * The test SimpleArray collection
 */
public class ISimplyArrayListTest {

    /**
     * Create SimpleArray
     */
    private ISimplyArrayList stringISimplyArrayList;

    @Before
    public void setUp() {
        stringISimplyArrayList = new SimplyArrayList<String>();
    }

    @Test
    public void addString() {
        /*
        Add items to ISimplyArrayList
         */
        stringISimplyArrayList.add("one");
        stringISimplyArrayList.add("two");
        stringISimplyArrayList.add("tree");

        /*
        Check then not null and size equals
         */
        assertNotNull(stringISimplyArrayList);
        assertEquals(3, stringISimplyArrayList.size());
    }

    @Test
    public void deleteByIndex() {
        /*
        Add items to ISimplyArrayList
         */
        stringISimplyArrayList.add("one");
        stringISimplyArrayList.add("two");
        stringISimplyArrayList.add("tree");

        /*
        Delete item from ISimplyArrayList
         */
        stringISimplyArrayList.delete(2);

        /*
        Check then not null and size equals
         */
        assertNotNull(stringISimplyArrayList);
        assertEquals(2, stringISimplyArrayList.size());
    }

    @Test
    public void getByIndex() {
        /*
        Add items to ISimplyArrayList
         */
        stringISimplyArrayList.add("one");
        stringISimplyArrayList.add("two");
        stringISimplyArrayList.add("tree");

        /*
        Get item by item id
         */
        stringISimplyArrayList.get(2);

        /*
        Check then not null and size equals
         */
        assertNotNull(stringISimplyArrayList);
        assertEquals("tree", stringISimplyArrayList.get(2));
    }

    @Test
    public void sizeArray() {
        /*
        Add items to ISimplyArrayList
         */
        stringISimplyArrayList.add("one");
        stringISimplyArrayList.add("two");
        stringISimplyArrayList.add("tree");

        /*
        Get size simple array
         */
        stringISimplyArrayList.size();

        /*
        Check then not null, not equals 0 and size equals
         */
        assertNotNull(stringISimplyArrayList);
        assertNotEquals(0, stringISimplyArrayList.size());
        assertEquals(3, stringISimplyArrayList.size());
    }

    @Test
    public void updateByIndex() {
        /*
        Add items to ISimplyArrayList
         */
        stringISimplyArrayList.add("one");
        stringISimplyArrayList.add("two");
        stringISimplyArrayList.add("tree");

        /*
        Update item by id
         */
        stringISimplyArrayList.update(2, "tree-tree");

        /*
        Check then not null and item equals item after update
         */
        assertNotNull(stringISimplyArrayList);
        assertEquals("tree-tree", stringISimplyArrayList.get(2));
    }

    /*
    Negative test, delete item when array is empty
     */
    @Test(expected = NegativeArraySizeException.class)
    public void deleteItem_whenArraySizeZero(){
        stringISimplyArrayList.delete(1);
    }

    /*
    Negative test, get item when array is empty
     */
    @Test(expected = NegativeArraySizeException.class)
    public void getItem_whenArraySizeZero(){
        stringISimplyArrayList.delete(1);
    }

    /*
    Negative test, update item when array is empty
     */
    @Test(expected = NegativeArraySizeException.class)
    public void updateItem_whenArraySizeZero(){
        stringISimplyArrayList.delete(1);
    }

}