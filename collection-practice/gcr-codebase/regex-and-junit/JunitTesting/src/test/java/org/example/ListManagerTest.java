package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ListManagerTest {

    private ListManager obj;

    @BeforeEach
    void setUp() {
        obj = new ListManager();
    }

    @Test
    void addingElementsAndSize() {
        obj.addElement(1);
        obj.addElement(2);
        obj.addElement(3);
        obj.addElement(4);
        assertEquals(4, obj.size());
    }

    @Test
    void removeElementFromEmptyList() {
        assertFalse(obj.removeElement(56));
    }

    @Test
    void removeExistingElement() {
        obj.addElement(10);
        obj.addElement(20);
        obj.addElement(30);

        assertTrue(obj.removeElement(20));
        assertEquals(2, obj.size());
        assertFalse(obj.getList().contains(20));
    }

    @Test
    void removeNonExistingElement() {
        obj.addElement(1);
        obj.addElement(2);
        assertFalse(obj.removeElement(999));
        assertEquals(2, obj.size());
    }

    @Test
    void addAndRemoveMultipleTimes() {
        obj.addElement(5);
        obj.addElement(5);
        assertTrue(obj.removeElement(5));
        assertEquals(1, obj.size());
    }

    @Test
    void sizeAfterMultipleOperations() {
        obj.addElement(100);
        obj.removeElement(100);
        obj.addElement(200);
        assertEquals(1, obj.size());
    }
}
