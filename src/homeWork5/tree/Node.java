package homeWork5.tree;

public class Node {
    private final int value;
    private Node leftNode;
    private Node rightNode;

    public Node(int value) {
        this.value = value;
    }

    public Node addNode(Node node) {
        if (node.value > value) {
            if (rightNode != null) {
                rightNode.addNode(node);
            } else {
                rightNode = node;
            }
        } else if (node.value < value) {
            if (leftNode != null) {
                leftNode.addNode(node);
            } else {
                leftNode = node;
            }
        }
        return this;
    }


    public int getValue() {
        return value;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }
}
