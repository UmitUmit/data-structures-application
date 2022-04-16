import java.util.LinkedList;
import java.util.Queue;

public class MyTree {

    public Node root;


    public MyTree() {

    }

    public MyTree(Node root) {
        this.root = root;
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        if (root == null) {
            root = newNode;
            return;
        }
        Node current = root;
        while (true) {
            if (value <= current.value) {
                if (current.leftChild == null) {
                    current.leftChild = newNode;

                    break;
                }
                current = current.leftChild;
            } else {
                if (current.rightChild == null) {
                    current.rightChild = newNode;

                    break;
                }
                current = current.rightChild;
            }
        }
    }// end insert


    //PreOrder Traversal of Tree Root-left-right

    public void preOrderTraversal(Node root) {
        if (root == null) return;
        System.out.print(root.value + ", ");
        preOrderTraversal(root.leftChild);
        preOrderTraversal(root.rightChild);

    }

    //InOrder Traversal of Tree Root-left-right

    public void inOrderTraversal(Node root) {
        if (root == null) return;
        inOrderTraversal(root.leftChild);
        System.out.print(root.value + ", ");
        inOrderTraversal(root.rightChild);

    }

    //InOrder Traversal of Tree Root-left-right

    public void postOrderTraversal(Node root) {
        if (root == null) return;
        postOrderTraversal(root.leftChild);
        postOrderTraversal(root.rightChild);
        System.out.print(root.value + ", ");

    }


    public void levelOrderTraversal(Node root) {
        if (this.root == null) return;
        Queue<Node> queue = new LinkedList<>();
        queue.add(this.root);
        while (!queue.isEmpty()) {
            Node toVisit = queue.poll(); //poll don't give exception
            System.out.println(toVisit.value + ", ");
            if (toVisit.leftChild != null) queue.add(toVisit.leftChild);
            if (toVisit.rightChild != null) queue.add(toVisit.rightChild);
        }// end while

    } //end levelOrder

    //task-1 implement contains method
    public boolean contains(int value) {
        if (root == null) return false;
        Node current = root;
        while (current != null) {
            if (value < current.value) current = current.leftChild;       //branch left
            else if (value > current.value) current = current.rightChild;   //branch right
            else return true;
        }

        return false;
    }

}
