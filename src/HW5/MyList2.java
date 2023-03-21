package HW5;

import java.util.ArrayList;


public class MyList2<T> {
    private ArrayList<T> list;

    public MyList2() {
        list = new ArrayList<T>();
    }

    public void add(T element) {
        list.add(element);
    }

    public T largest() {
        if (list.isEmpty()) {
            return null;
        }
        T largest = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            Comparable<T> curr = (Comparable<T>) list.get(i);
            if (curr.compareTo(largest) > 0) {
                largest = list.get(i);
            }
        }
        return largest;
    }

    public T smallest() {
        if (list.isEmpty()) {
            return null;
        }
        T smallest = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            Comparable<T> curr = (Comparable<T>) list.get(i);
            if (curr.compareTo(smallest) < 0) {
                smallest = list.get(i);
            }
        }
        return smallest;
    }
}


