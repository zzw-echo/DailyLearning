/**
 * Created by zhangzewen on 2020/7/1
 */
public class Node {
    private int value;
    private Node left;
    private Node right;

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                "}";
    }

    public void setValue(int value) {
        this.value = value;
    }



    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }


    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public Node() {
    }

    public Node(int value, Node node, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }
}
