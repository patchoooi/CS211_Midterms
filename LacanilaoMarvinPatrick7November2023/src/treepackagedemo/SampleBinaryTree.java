/**
 * This class demonstrates the Huffman coding algorithm for encoding characters.
 *
 @author Lacanilao, Marvin Patrick D.
 @activity Midterm Review Exercise
 @classcode 9342 - CS 211 Data Structures
 -----------------------------------------------------------------------------------------------------------------
 SAMPLE RUN:

 PREORDER:
 83 66 53 21 28 5 55 27 3

 INORDER:
 66 53 21 28 5 83 55 27 3

 POSTORDER:
 66 53 21 28 5 55 27 3 83

 Process finished with exit code 0
 */

package treepackagedemo;

/**
 * A class that demonstrates a simple binary tree and provides methods for printing its nodes
 */

public class SampleBinaryTree {

    /**
     * The main entry point of the program.
     *
     * @param args The command line arguments passed to the program.
     */
    public static void main(String[] args) {
        SampleBinaryTree test;
        try {
            test = new SampleBinaryTree();
            test.run();
        } catch(Exception ex){
            ex.printStackTrace();
        }
        System.exit(0);
    }

    /**
     * Initializes and runs the binary tree demonstration.
     */
    public void run(){
        Tree<Integer> tree = new Tree<Integer>();
        Node<Integer> leaf1 = new Node<Integer>(21, null, null);
        Node<Integer> leaf2 = new Node<Integer>(28, null, null);
        Node<Integer> leaf3 = new Node<Integer>(5, null, null);
        Node<Integer> leaf4 = new Node<Integer>(27, null, null);
        Node<Integer> leaf5 = new Node<Integer>(3, null, null);
        Node<Integer> node3 = new Node<Integer>(53, leaf1, leaf2);
        Node<Integer> node2 = new Node<Integer>(66, node3, leaf3);
        Node<Integer> node4 = new Node<Integer>(55, leaf4, leaf5);
        tree.setRoot(new Node<Integer>(83, node2, node4));

        System.out.println("PREORDER:");
        printPreOrder(tree.getRoot());

        System.out.println();
        System.out.println();

        System.out.println("INORDER:");
        printInOrder(tree.getRoot());

        System.out.println();
        System.out.println();

        System.out.println("POSTORDER:");
        printPostOrder(tree.getRoot());
    }

    /**
     * Prints the nodes of the binary tree in pre-order traversal.
     *
     * @param node The current node to print.
     */
    public void printPreOrder(Node<Integer> node){
        if (node != null){
            System.out.print(node.getValue() + " ");
            printPreOrder(node.getLeft());
            printPreOrder(node.getRight());
        }
    }

    /**
     * Prints the nodes of the binary tree in in-order traversal.
     *
     * @param node The current node to print.
     */
    public void printInOrder(Node<Integer> node){
        if (node != null){
            printPreOrder(node.getLeft());
            System.out.print(node.getValue() + " ");
            printPreOrder(node.getRight());
        }
    }

    /**
     * Prints the nodes of the binary tree in post-order traversal.
     *
     * @param node The current node to print.
     */
    public void printPostOrder(Node<Integer> node){
        if (node != null){
            printPreOrder(node.getLeft());
            printPreOrder(node.getRight());
            System.out.print(node.getValue() + " ");
        }
    }
}
