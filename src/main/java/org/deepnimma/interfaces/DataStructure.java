package org.deepnimma.interfaces;

import org.deepnimma.nodes.Node;

import java.util.List;

public interface DataStructure<T extends Comparable<T>> {


    /**
     * Insert an item into the DataStructure.
     * @param data the data to insert into the data structure.
     */
    public void insert(T data);

    /**
     * Inserts all the elements in the second data structure that is passed as a parameter. Adds elements
     * as presented by otherStructure's removeLast method.
     * @param otherStructure The second data structure to get all the new elements from.
     */
    public void insertAll(DataStructure<T> otherStructure);

    /**
     * Delete an item into the data structure. Doesn't do anything if the specified item is not found in the
     * data structure. Returns if the data value is not found.
     * @param data the data to delete.
     * @return data if it was deleted. Otherwise returns {@code null}
     */
    public T delete(T data);

    /**
     * Delete the given index in the list.
     * @param index the index to delete
     * @throws IndexOutOfBoundsException if the index is <0 or  >=size().
     * @return the data deleted at the index.
     */
    public T deleteAt(int index);

    /**
     * Removes the first element in the list and returns it.
     * @return the first element in the list after removing it. Returns {@code null} if the list is empty.
     */
    public T removeFirst();

    /**
     * Removes the last element in the list and returns it.
     * @return the last element in the list after removing it. Returns {@code null} if the list is empty.
     */
    public T removeLast();

    /**
     * Changes the value of the node at index to the given value.
     * @param index the node index to change.
     * @param newVal the value to change the node to.
     * @return the previous value before the node was changed.
     * @throws IndexOutOfBoundsException if the index is out of bounds.
     */
    public T set(int index, T newVal);

    /**
     * Searches for the given data value in the data structure. Return codes appropriately.
     * @param data the data value to search for in the structure.
     * @return {@code true} if found, else {@code false}.
     */
    public boolean search(T data);

    /**
     * Returns the index of the given data value if found. Returns -1 if the data value does
     * not exist in the data structure.
     * @param data the data value to search for.
     * @return the index of the data value if found. Returns -1 if the value was not found.
     */
    public int indexOf(T data);

    /**
     * Prints out the current state of the data structure in a straight line.
     * Exits after printing out a '\n' character.
     */
    public void print();

    /**
     * Get the value stored at a specific index.
     * @param index the index to get the data for.
     * @return the data value stored at the specified index. Returns {@code null} if the index is OutOfBounds
     */
    public T get(int index);

    /**
     * Returns the current size of the data structure.
     * @return the current size of the data structure.
     */
    public int size();

    /**
     * Returns a boolean value based on whether the current data structure is empty or not.
     * @return {@code true} if the data structure is empty, else {@code false}.
     */
    public boolean isEmpty();

    /**
     * Removes all duplicates from the data structure. Changes the current structure in its place.
     * DOES NOT RETURN a new data structure.
     */
    public void removeDuplicates();

    /**
     * Combines to data structures. The second data structure can be of any type as long as the class
     * extends the {@link DataStructure<T>} interface.
     * This is basically a union of two sets function.
     * @param secondStructure the second structure to combine with the current one.
     */
    public void combine(DataStructure<T> secondStructure);

    /**
     * Removes all uncommon elements from the data structure after comparing it with the secondStructure.
     * The second data structure can be of any type as long as the class extends the {@link DataStructure<T>}
     * interface.
     * This is basically a intersection of two sets function.
     * @param secondStructure the second data structure to check against.
     */
    public void intersect(DataStructure<T> secondStructure);

    /**
     * Get a sub structure from startIndex (inclusive) to endIndex (exclusive)
     * @param startIndex the index to start from. Is inclusive.
     * @param endIndex the index to end at. Is exclusive.
     * @throws IndexOutOfBoundsException if {@code startIndex} or {@code endIndex} is out of bounds.
     * @return the Data Structure with elements from [startIndex, endIndex)
     */
    public DataStructure<T> subStructure(int startIndex, int endIndex);

    /**
     * Get the first value of the data structure without removing it.
     * @return the first value or head of the data structure.
     */
    public T getFirstValue();

    /**
     * Get the last value of the data structure without removing it.
     * @return the last value or tail of the data structure.
     */
    public T getLastValue();

    /**
     * Returns the smallest value in the data structure.
     * @return the smallest value in the data structure.
     */
    public T getSmallestValue();

    /**
     * Returns the largest value in the data structure.
     * @return the largest value in the data structure.
     */
    public T getLargestValue();

    /**
     * Converts the data structure into an array and returns it.
     *
     * @return the array form of the current data structure.
     */
    public List<T> toArray();

    /**
     * Empties the data structure.
     */
    public void clear();

    /**
     * Returns a string of the elements in a list with a space in between them. String ends in a \n.
     * @return the string of all the elements in the data structure.
     */
    @Override
    public String toString();
} // DataStructure
