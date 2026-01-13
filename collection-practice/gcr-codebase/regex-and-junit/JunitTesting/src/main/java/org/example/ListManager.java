package org.example;

import java.util.ArrayList;
import java.util.Iterator;

public class ListManager {
    ArrayList<Integer> arr = new ArrayList<>();

    public int size() {
        return arr.size();
    }
    public boolean addElement(int ele) {
        return arr.add(ele);
    }

    public boolean removeElement(int ele) {
        Iterator<Integer> iterator = arr.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() == ele) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
    public ArrayList<Integer> getList() {
        return new ArrayList<>(arr);
    }
}
