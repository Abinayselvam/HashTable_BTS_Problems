class BinarySearchTree<K extends Comparable<K>> {

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

        // Go left
        if (key.compareTo(current.getKey()) < 0) {

            current.setLeft(
                    addRecursive(
                            current.getLeft(),
                            key
                    )
            );
        }

        // Go right
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

    // Inorder Traversal
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
}