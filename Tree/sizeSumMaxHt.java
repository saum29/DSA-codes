public class sizeSumMaxHt {

    public static int size(Node node) {
        if (node == null) {
            return 0;
        }

        int ls = size(node.left);
        int rs = size(node.right);
        return ls + rs + 1;

    }

    public static int sum(Node node) {
        if (node == null) {
            return 0;
        }

        int leftSum = sum(node.left);
        int rightSum = sum(node.right);

        return leftSum + rightSum + node.data;

        // return (node == null)? 0: sum(node.left) + sum(node.right) + node.data;
    }

    public static int max(Node node) {
        if (node == null) {
            return Integer.MIN_VALUE; // to consider max in any case when val is jst greater than -inf
        }

        int lmax = max(node.left);
        int rmax = max(node.right);

        return Math.max(node.data, Math.max(lmax, rmax));
    }

    public static int height(Node node) {
        if (node == null) {
            return -1; // h_node = h_edge + 1, so when node is 0 h_edge = -1
        }

        int lh = height(node.left);
        int rh = height(node.right);

        return Math.max(lh, rh) + 1;
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
