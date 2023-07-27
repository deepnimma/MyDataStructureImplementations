package org.deepnimma.interfaces;

import org.deepnimma.nodes.Node;

public interface DataStructure<T extends Comparable<T>> {
    /**
     * Insert an item into the DataStructure.
     * @param data the data to insert into the data structure.
     */
    public void insert(T data);

    /**
     * Delete an item into the data structure. Doesn't do anything if the specified item is not found in the
     * data structure.
     * @param data the data to delete.
     */
    public void delete(T data);

    /**
     * Searches for the given data value in the data structure. Returns codes appropriately.
     * @param data the data value to search for in the structure.
     * @return the index of the data value if found, else -1.
     */
    public int search(T data);

    /**
     * Prints out the current state of the data structure in a straight line.
     * Exits after printing out a '\n' character.
     */
    public void print();

    /**
     * Get the value stored at a specific index.
     * @throws IndexOutOfBoundsException if the index is greater than size-1 or less than 0.
     * @param index the index to get the data for.
     * @return the data value stored at the specified index.
     */
    public T get(int index);

    /**
     * Returns the current size of the data structure.
     * @return the current size of the data structure.
     */
    public int size();

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
     * Returns a string of the elements in a list with a space in between them. String ends in a \n.
     * @return the string of all the elements in the data structure.
     */
    @Override
    public String toString();
}
