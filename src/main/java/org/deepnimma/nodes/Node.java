package org.deepnimma.nodes;

public class Node<T extends Comparable<T>> {
    protected T data;

    /**
     * Default constructor for the Node class.
     */
    public Node() {
        this.data = null;
    } // Node

    /**
     * Constructor taking data field.
     * @param data The data to store in the node.
     */
    public Node(T data) {
        this.data = data;
    } // Node

    /**
     * Getter function for the data field.
     * @return the data stored in the node.
     */
    public T getData() {
        return data;
    } // getData

    /**
     * Setter function for the data field.
     * @param data the data to change the node to.
     */
    public void setData(T data) {
        this.data = data;
    } // setData

    /**
     * Checks if the given data is greater than the stored data.
     * @param secondData the data to check against.
     * @return {@code true} if {@code secondData} > {@code data} else {@code false}.
     */
    public boolean isGreaterThanData(T secondData) {
        return data.compareTo(secondData) < 0;
    } // isGreaterThanData

    /**
     * Checks if the given data is lesser than the stored data.
     * @param secondData the data to check against.
     * @return {@code true} if {@code secondData} < {@code data} else {@code false}.
     */
    public boolean isLesserThanData(T secondData) {
        return data.compareTo(secondData) > 0;
    } // isLesserThanData

    /**
     * Checks if the given data is equal to the store data.
     * @param secondData the data to check against.
     * @return {@code true} if they are equal else {@code false}.
     */
    public boolean isEqualToData(T secondData) {
        return data.equals(secondData);
    } // isEqualToData

    /**
     * Checks if the given data is greater than or equal to the store data.
     * @param secondData the data to check against
     * @return {@code true} if the given data is greater than or equal to the stored data
     * else {@code false}.
     */
    public boolean isGreaterThanOrEqualTo(T secondData) {
        return isGreaterThanData(secondData) || isEqualToData(secondData);
    }

    @Override
    public String toString() {
        return data.toString();
    } // toString
} // Node
