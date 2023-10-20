/**
 * This class demonstrates the Huffman coding algorithm for encoding characters.
 *
 @author Lacanilao, Marvin Patrick D.
 @activity Midterm Laboratory Exercise 5
 @classcode 9342 - CS 211 Data Structures
 -----------------------------------------------------------------------------------------------------------------
 SAMPLE RUN:
 Char | Huffman code
 --------------------
 F | 00000
 G | 00001
 H | 0001
 B | 001
 A | 01
 C | 100
 D | 101
 E | 11

 Tested By: LACANILAO, Marvin Patrick D.

 Process finished with exit code 0

 */
import java.util.PriorityQueue;
public class HuffmanTest {

    /**
     * Prints the Huffman code for each character in the tree.
     *
     * @param root The root of the Huffman tree.
     * @param s The current code being generated.
     */
    public static void printCode(TreeNode root, String s) {
        if (root.getLeft() == null && root.getRight() == null && Character.isLetter(root.getSymbol())) {
            System.out.println(root.getSymbol() + " | " + s);
            return;
        }

        printCode(root.getLeft(), s + "0");
        printCode(root.getRight(), s + "1");
    }

    /**
     * The main method for testing the Huffman coding algorithm.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        int n = 8;
        char[] symbolArray = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H'};
        int[] symbolFrequency = {30, 12, 13, 20, 45, 2, 2, 7};

        PriorityQueue<TreeNode> huffmanTree = new PriorityQueue<TreeNode>(n);

        // Create Huffman nodes and add them to the priority queue.
        for (int i = 0; i < n; i++) {
            TreeNode huffmanNode = new TreeNode();

            huffmanNode.setSymbol(symbolArray[i]);
            huffmanNode.setCount(symbolFrequency[i]);
            huffmanNode.setLeft(null);
            huffmanNode.setRight(null);

            huffmanTree.add(huffmanNode);
        }

        TreeNode root = null;

        // Build the Huffman tree.
        while (huffmanTree.size() > 1) {
            TreeNode t = huffmanTree.peek();
            huffmanTree.poll();

            TreeNode u = huffmanTree.peek();
            huffmanTree.poll();

            TreeNode v = new TreeNode();

            v.setCount(t.getCount() + u.getCount());
            v.setSymbol('-');
            v.setLeft(t);
            v.setRight(u);
            root = v;

            huffmanTree.add(v);
        }

        // Print the Huffman codes.
        System.out.println("Char | Huffman code");
        System.out.println("--------------------");
        printCode(root, "");
        System.out.println();
        System.out.println("Tested By: LACANILAO, Marvin Patrick D.");
    }
}