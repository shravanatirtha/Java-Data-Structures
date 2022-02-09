public class BinaryTreeCreation {
    // binary tree creation
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void preorder(Node root) { // root-lefft-right
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) { // left-root-right
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }

    public static void main(String[] args) {
        int[] a = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        Node root = BinaryTreeCreation.BinaryTree.createTree(a);
        System.out.println(root.data);
        preorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        postorder(root);
    }

    static class BinaryTree {
        static int index = -1;

        public static Node createTree(int[] nums) {
            index++;
            if (nums[index] == -1)
                return null;
            Node root = new Node(nums[index]);
            root.left = createTree(nums);
            root.right = createTree(nums);
            return root;
        }
    }
}
