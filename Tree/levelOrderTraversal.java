import java.util.ArrayDeque;

public class levelOrderTraversal {

    public static void levelOrderApproach1(Node node) {
        ArrayDeque<Node> pq = new ArrayDeque<>();
        ArrayDeque<Node> cq = new ArrayDeque<>();

        // put root node inside
        pq.add(node);

        while (pq.size() > 0) {
            // 1. remove
            Node temp = pq.remove();

            // 2. print
            System.out.print(temp.data + " ");

            // 3. add
            if (temp.left != null) {
                cq.add(temp.left);
            }

            if (temp.right != null) {
                cq.add(temp.right);
            }

            if (pq.size() == 0) {
                pq = cq;
                cq = new ArrayDeque<>();
                System.out.println();
            }
        }
    }

    public static void levelOrderApproach2(Node node) {
        ArrayDeque<Node> pq = new ArrayDeque<>();

        // put root node inside
        pq.add(node);

        while (pq.size() > 0) {
            int count = pq.size();

            for (int i = 0; i < count; i++) {
                // 1. remove
                Node temp = pq.remove();

                // 2. print
                System.out.print(temp.data + " ");

                // 3. add
                if (temp.left != null) {
                    pq.add(temp.left);
                }

                if (temp.right != null) {
                    pq.add(temp.right);
                }
            }
            System.out.println();
        }
    }

    public static class Node {
        int data;
        Node left;
        Node right;

        Node() {

        }

        Node(int data, Node left, Node right) {
            this.data = data;
            this.left = left;
            this.right = right;
        }
    }

    public static void main(String[] args) {

    }
}
