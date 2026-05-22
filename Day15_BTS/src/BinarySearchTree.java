public class BinarySearchTree<K extends Comparable<K>> {

    private INode<K> root;

    // Add node
    public void add(K key) {

        root = addRecursive(root, key);
    }

    // Recursive insertion
    private INode<K> addRecursive(
            INode<K> current,
            K key) {

        // Create node
        if (current == null) {

            return new BinaryNode<>(key);
        }

        // Left subtree
        if (key.compareTo(current.getKey()) < 0) {

            current.setLeft(
                    addRecursive(
                            current.getLeft(),
                            key
                    )
            );
        }

        // Right subtree
        else if (key.compareTo(current.getKey()) > 0) {

            current.setRight(
                    addRecursive(
                            current.getRight(),
                            key
                    )
            );
        }

        return current;
    }

    // Display inorder
    public void display() {

        inorder(root);
    }

    private void inorder(INode<K> node) {

        if (node != null) {

            inorder(node.getLeft());

            System.out.print(
                    node.getKey() + " "
            );

            inorder(node.getRight());
        }
    }

    // Search method
    public boolean search(K key) {

        return searchRecursive(root, key);
    }

    private boolean searchRecursive(
            INode<K> current,
            K key) {

        // Not found
        if (current == null) {

            return false;
        }

        // Found
        if (key.compareTo(current.getKey()) == 0) {

            return true;
        }

        // Search left
        if (key.compareTo(current.getKey()) < 0) {

            return searchRecursive(
                    current.getLeft(),
                    key
            );
        }

        // Search right
        return searchRecursive(
                current.getRight(),
                key
        );
    }
}