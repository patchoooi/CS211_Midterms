/**
 @author Lacanilao, Marvin Patrick D.
 @activity Midterm Laboratory Exercise 5
 @classcode 9342 - CS 211 Data Structures
 */
public class TreeNode implements Comparable<TreeNode>{
    int count;
    char symbol;
    TreeNode left;
    TreeNode right;

    public TreeNode(){
        count = 0;
        symbol = 'x';
        left = null;
        right = null;
    }

    public TreeNode(int count, char symbol, TreeNode left, TreeNode right){
        this.count = count;
        this.symbol = symbol;
        this.left = left;
        this.right = right;
    }

    public int getCount() {
        return count;
    }

    public char getSymbol() {
        return symbol;
    }

    public TreeNode getLeft() {
        return left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public int compareTo(TreeNode other){
        if (this.getCount() == other.getCount()){
            return 0;
        }else if (this.getCount() < other.getCount()){
            return  -1;
        }else {
            return 1;
        }
    }
}
