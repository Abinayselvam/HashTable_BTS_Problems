public class BinarySearchTree<K extends Comparable<K>> {

    private INode<K> root;

    // Add node
    public void add(K key) {

        root = addRecursive(root, key);
    }

    // Recursive add
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

    // Size method
    public int size() {

        return sizeRecursive(root);
    }

    private int sizeRecursive(
            INode<K> node) {

        // Base case
        if (node == null) {

            return 0;
        }

        // Count current + left + right
        return 1
                + sizeRecursive(node.getLeft())
                + sizeRecursive(node.getRight());
    }
}