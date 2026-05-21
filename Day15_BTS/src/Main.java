public class Main {

    public static void main(String[] args) {

        System.out.println(
                "Welcome to Binary Search Tree"
        );

        BinarySearchTree<Integer> bst =
                new BinarySearchTree<>();

        // Add nodes
        bst.add(56);
        bst.add(30);
        bst.add(70);
        bst.add(22);
        bst.add(40);
        bst.add(60);
        bst.add(95);

        System.out.println(
                "\nInorder Traversal:"
        );

        bst.display();

        System.out.println(
                "\n\nSize of BST: "
                        + bst.size()
        );
    }
}