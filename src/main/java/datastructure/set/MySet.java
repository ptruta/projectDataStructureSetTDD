package datastructure.set;

public class MySet<T> {
    private T[] set;
    private int size = 0;
    private int defaultSize = 2;

    public MySet() {
        set = (T[]) new Object[defaultSize];
    }

    public void add(T item) {
        if (isEmpty()) {
            var tempSet = new Object[set.length*2];
            set = (T[])tempSet;
        }

        if (size + 1 > defaultSize) {
            var tempSet = new Object[set.length*2]; // double the size of the new temporary set
            for (int i=0;i<set.length;i++) {
                tempSet[i] = set[i];
            }
            set = (T[])tempSet;
        }

        if (!contains(item) && !isEmpty()) {
            set[size++] = item;
        }
    }

    public int size() {
        return size;
    }

    public boolean contains(T item) {
        int count = 0;
        boolean itContains = false;
        while (count < size && !itContains) {
            if (set[count] == item) {
                itContains = true;
            }
            count++;
        }

        return itContains;
    }

    public boolean isEmpty() {
        return set.length == 0;
    }

    public void removeElement(T item) {
        if (isEmpty()) {
            return;
        }

        if (contains(item)) {
            int count = 0;
            while (count < size && set[count] != item) {
                count++;
            }

            for (int i = count + 1;i < set.length; i++) {
                set[i - 1] = set[i];
            }

            size--;
        }
    }
}
