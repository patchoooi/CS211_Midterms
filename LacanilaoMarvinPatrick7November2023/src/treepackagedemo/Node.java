/**
 @author Lacanilao, Marvin Patrick D.
 @activity Midterm Review Exercise
 @classcode 9342 - CS 211 Data Structures
 -----------------------------------------------------------------------------------------------------------------
 */

package treepackagedemo;

public class Node<T> {
    private T value;
    private Node<T> left;
    private Node<T> right;

    /**
     * Initializes an empty node with null value, left, and right child references.
     */
    public Node(){
        value = null;
        left = null;
        right = null;
    }

    /**
     * Initializes a node with the specified value and null left and right child references.
     *
     * @param value The data value to be stored in the node.
     */
    public Node(T value){
        this.value = value;
        left = null;
        right = null;
    }

    /**
     * Initializes a node with the specified value and left and right child references.
     *
     * @param value The data value to be stored in the node.
     * @param left  The left child node.
     * @param right The right child node.
     */
    public Node(T value, Node<T> left, Node<T> right){
        this.value = value;
        this.left = left;
        this.right = right;
    }

    /**
     * Sets the value of the node.
     *
     * @param value The data value to be stored in the node.
     */
    public void setValue(T value) {
        this.value = value;
    }

    /**
     * Sets the left child node.
     *
     * @param left The left child node to be set.
     */
    public void setLeft(Node<T> left) {
        this.left = left;
    }

    /**
     * Sets the right child node.
     *
     * @param right The right child node to be set.
     */
    public void setRight(Node<T> right) {
        this.right = right;
    }

    /**
     * Gets the value of the node.
     *
     * @return The data value stored in the node.
     */
    public T getValue() {
        return value;
    }

    /**
     * Gets the left child node.
     *
     * @return The left child node.
     */
    public Node<T> getLeft() {
        return left;
    }

    /**
     * Gets the right child node.
     *
     * @return The right child node.
     */
    public Node<T> getRight() {
        return right;
    }
}
