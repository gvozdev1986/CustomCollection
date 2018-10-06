# CustomCollection
An example of creating custom collections.

Presented collections:
<table>
    <tr>
        <td style="aligne: center;"><b>#</b></td>
        <td style="aligne: center;"><b>Name collection</b></td>
        <td style="aligne: center;"><b>Description</b></td>
        <td style="aligne: center;"><b>Interface</b></td>
    </tr>
    <tr>
        <td>1</td>
        <td>SimplyArray</td>
        <td>
            Simply array the same on ArrayList </br>
            <b>Description: </b></br>
            An array based arrays. Has basic techniques for working with
            array. To add a record, the old array is copied to the new one with the addition of
            new cell for new entry. To delete the index is copied old
            array to the specified index and copy the rest of the old array
            given that 1 element of the array is taken away. After everything is going. 
            This collection uses generics, therefore, the collection is parameterized.
            </br>
            <b>METHODS</b>
            </br>
                <ol>
                    <li>boolean add(E e);</li>
                    <li>void delete(int index);</li>
                    <li>E get(int index);</li>
                    <li>E getFirst();</li>
                    <li>E getLast();</li>
                    <li>void clear();</li>
                    <li>int size();</li>
                    <li>void update(int index, E e);</li>                
                </ol>
        </td>
        <td>ISimplyArrayList.java</td>        
    </tr>
</table>
