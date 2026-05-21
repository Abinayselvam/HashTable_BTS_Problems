public class Main {

    public static void main(String[] args) {

        System.out.println(
                "Welcome to BST Program"
        );

        BinarySearchTree<Integer> bst =
                new BinarySearchTree<>();

        bst.add(56);
        bst.add(30);
        bst.add(70);

        System.out.println(
                "\nBST Inorder Traversal:"
        );

        bst.display();
    }
}