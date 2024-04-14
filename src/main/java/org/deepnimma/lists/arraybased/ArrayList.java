package org.deepnimma.lists.arraybased;

import java.util.Arrays;
import java.util.Iterator;

import org.deepnimma.abstracts.AbstractUnsortedStructure;
import org.deepnimma.interfaces.GenericStructure;
import org.deepnimma.interfaces.lists.UnsortedStructure;

/**
 * Data structure that allows the user to store any number of elements of type E. Uses an array to store the elements and increments it by a default number or a number
 * set by the user.
 * @param <E> the type of elements to be stored.
 */
public class ArrayList<E> extends AbstractUnsortedStructure<E> implements UnsortedStructure<E> {
    private Object[] holder;
    private int currEnd = 0;
    private boolean isFull = false;

    /**
     * Initialize ArrayList according to the initialSize and capacity provided.
     * @param initialSize the initialSize of the array
     * @param capacity the initialCapacity of the array
     * @throws ArrayStoreException if the capacity is less than the initial size.
     */
    public ArrayList(int initialSize, int capacity) {
        super(initialSize, capacity);
    } // ArrayList

    /**
     * Initialize the ArrayList according to the initialSize provided. Capacity is set to 3 * initialSize by default.
     * @param initialSize the initialSize of the data storing array.
     */
    public ArrayList(int initialSize) { super(initialSize); }

    /**
     * Initializes the ArrayList according to the default initialSize (= ) and capacity (= ).
     */
    public ArrayList() { super(); }

    /**
     * {@inheritDoc}
     */
    @Override
    protected void _initialize_structure(int initialSize) {
        holder = new Object[initialSize];
    } // _initialize_structure

    /**
     * Function to double the size of the holder array the structure depends on.
     */
    private void _increase_array_size() {
        // We need to double the size of the array.
        Object[] newHolder = new Object[holder.length * 2];
        this.CAPACITY = newHolder.length;

        System.arraycopy(this.holder, 0, newHolder, 0, size()); // Copy the array over

        this.holder = newHolder;
    } // _increase_array_size

    private void _check_full() {
        this.isFull = (size() == this.CAPACITY);
    } // _check_full

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean add(E e) {
        if (this.isFull) {
            _increase_array_size();
            _check_full();
        } // if

        this.holder[currEnd] = e;
        size++;
        currEnd++;

        return true;
    } // add

    @Override
    public boolean addAll(GenericStructure<? extends E> c) {
        for (int i = 0; i < c.size(); i++) {
            add(c.get(i));
        } // for

        return true;
    } // addAll

    @Override
    public void clear() {
        currEnd = 0;
        size = 0;
    } // clear

    /**
     * Clears the array and also sets every object to null.
     * @param empty Whether to empty the holder array or not. If set to {@code false} it will simply call {@code clear()}.
     */
    public void clear(boolean empty) {
        if (empty) {
            for (int i = 0; i < holder.length; i++) {
                this.holder[i] = null;
                size--;
            } // for
        } else {
            clear();
        } // if-else
    } // clear

    @Override
    public boolean remove(Object o) {
        if (!contains(o)) {
            return false;
        } // if

        for (int i = 0; i < size(); i++) {
            if (this.holder[i].equals(o)) {
                // move holder objects after this entry one step back.
                for (int j = i; j < currEnd - 1; j++) {
                    this.holder[j] = this.holder[j + 1];
                } // for

                size--;
                currEnd--;
                return true;
            } // if
        } // for

        return false;
    } // remove

    @Override
    public boolean removeAll(GenericStructure<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(GenericStructure<?> c) {
        return false;
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(GenericStructure<?> c) {
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public UnsortedStructure<E> subList(int fromIndex, int toIndex) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public E getLast() {
        return null;
    }

    @Override
    public E getFirst() {
        return null;
    }

    @Override
    public E set(int index, E element) {
        return null;
    }
} // ArrayList
