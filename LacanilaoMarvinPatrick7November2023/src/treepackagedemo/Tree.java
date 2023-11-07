/**
 @author Lacanilao, Marvin Patrick D.
 @activity Midterm Review Exercise
 @classcode 9342 - CS 211 Data Structures
 -----------------------------------------------------------------------------------------------------------------
 */

package treepackagedemo;

public class Tree<T> {
    private Node<T> root;

    /**
     * Initializes an empty binary tree.
     */
    public Tree(){
        root = null;
    }

    /**
     * Sets the root node of the binary tree.
     *
     * @param root The new root node to be set.
     */
    public void setRoot(Node<T> root){
        this.root = root;
    }

    /**
     * Gets the root node of the binary tree.
     *
     * @return The root node of the tree.
     */
    public Node<T> getRoot() {
        return root;
    }
}

