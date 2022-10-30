package datastructure.set;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MySetTest {

    private MySet<Integer> mySet;

    @BeforeEach
    public void setUp() {
        mySet = new MySet<Integer>();
        mySet.add(1);
        mySet.add(2);
        mySet.add(3);
        mySet.add(2);
    }

    @Test
    public void itShouldAddAnElementToTheSet() {
        assertEquals(3,mySet.size());
    }

    @Test
    public void itShouldSeeIfItContainsAValueOrNotInTheSet() {
        assertTrue(mySet.contains(2));
        assertFalse(mySet.contains(4));
    }

    @Test
    public void itShouldDeleteElementFromTheSet() {
        mySet.removeElement(3);
        assertEquals(2, mySet.size());
    }

    @Test
    public void itShouldSeeIfTheSetIsEmptyOrNot() {
        assertFalse(mySet.isEmpty());
    }

    @AfterEach
    public void cleanUp() {
        mySet = null;
    }
}
