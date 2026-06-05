package list;

import universe.Universe;

public interface List<T extends Comparable<T>> {

    void add(T element);

    void remove(T element);

    T remove(int index);

    int size();

    boolean contains(T element);

    void clear();

    boolean isEmpty();

    T get(int index);

    void set(int index, T element);

    int indexOf(T element);
}
