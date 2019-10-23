package de.thro.inf.prg3.a04.collections;

public interface SimpleList<T> extends Iterable<T> {
    /**
     * Add a given object to the back of the list.
     */
    void add(T o);

    /**
     * @return current size of the list
     */
    int size();

    /**
     * Generate a new list using the given filter instance.
     *
     * @return a new, filtered list
     */
    default SimpleList<T> filter() {
        return new SimpleListImpl<T>();
    }

    default SimpleList<T> addDefault() {
        return new SimpleListImpl<T>();
    }

}
