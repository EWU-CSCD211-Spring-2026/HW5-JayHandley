package test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertion.assertEquals;
import static org.junit.jupiter.api.Assertion.assertNotNull;
import static org.junit.jupiter.api.Assertion.assertNull;
import static org.junit.jupiter.api.Assertion.assertThrows;

import list.*;

public class ListTests {

    @Test
    public void testElementAdd() {
        //Arrange
        List<String> addList = new LinkedList<>();

        //Act
        addList.add("A");
        addList.add("B");
        addList.add("C");

        //Assert
        String expected = "[A,B,C,] , size = 3, head: A, tail: C";
        String actual = addList.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testElementRemove() {
        //Arrange
        List<String> removeList = new LinkedList<>();
        removeList.add("A");
        removeList.add("B");
        removeList.add("C");

        //Act
        removeList.remove("A");

        //Assert
        String expected = "[B,C,] , size = 2, head: B, tail: C";
        String actual = removeList.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testIndexRemove() {
        //Arrange
        List<String> indexRemove = new LinkedList<>();
        indexRemove.add("A");
        indexRemove.add("B");
        indexRemove.add("C");

        //Act
        indexRemove.removeIndex(2);

        //Assert
        String expected = "[A,C,] , size = 2, head: A, tail: C";
        String actual = indexRemove.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetSize() {
        //Arrange
        List<String> sizeList = new LinkedList<>();
        sizeList.add("A");
        sizeList.add("B");
        sizeList.add("C");

        //Act

        //Assert
        int expected = 3;
        int actual = sizeList.size();
        assertEquals(expected, actual);
    }

    @Test
    public void testContainsElement() {
        //Arrange
        List<String> containsList = new LinkedList<>();
        containsList.add("A");
        containsList.add("B");
        containsList.add("C");

        //Act

        //Assert
        boolean expected = true;
        boolean actual = containsList.contains("B");
        assertEquals(expected, actual);
    }

    @Test
    public void testClearList() {
        //Arrange
        List<String> clearingList = new LinkedList<>();
        clearingList.add("A");
        clearingList.add("B");
        clearingList.add("C");

        //Act
        clearingList.clear();

        //Assert
        String expected = "[] , size = 0, head: null, tail: null";
        String actual = sizeList.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testForEmpty() {
        //Arrange
        List<String> emptyList = new LinkedList<>();

        //Act

        //Assert
        boolean expected = true;
        boolean actual = emptyList.isEmpty();
        assertEquals(expected, actual);
    }

    @Test
    public void testGetIndex() {
        //Arrange
        List<String> getIndexList = new LinkedList<>();
        getIndexList.add("A");
        getIndexList.add("B");
        getIndexList.add("C");

        //Act

        //Assert
        String expected = "B";
        String actual = getIndexList.get(2);
        assertEquals(expected, actual);
    }

    @Test
    public void testSetIndex() {
        //Arrange
        List<String> setIndexList = new LinkedList<>();
        setIndexList.add("A");
        setIndexList.add("B");
        setIndexList.add("C");

        //Act
        setIndexList.set(2, "D");

        //Assert
        String expected = "[A,D,C,] , size = 3, head: A, tail: C";
        String actual = setIndexList.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testIndexOf() {
        //Arrange
        List<String> indexList = new LinkedList<>();
        indexList.add("A");
        indexList.add("B");
        indexList.add("C");

        //Act

        //Assert
        int expected = 2;
        int actual = indexList.indexOf("B");
        assertEquals(expected, actual);
    }

}
