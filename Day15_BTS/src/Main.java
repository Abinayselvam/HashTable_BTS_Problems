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
                "\nBST Inorder Traversal:"
        );

        bst.display();

        // Search value
        int searchValue = 63;

        boolean found =
                bst.search(searchValue);

        if (found) {

            System.out.println(
                    "\n\n" + searchValue
                            + " found in BST"
            );
        }
        else {

            System.out.println(
                    "\n\n" + searchValue
                            + " not found in BST"
            );
        }
    }
}