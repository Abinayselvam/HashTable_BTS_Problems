public class BinaryNode<K extends Comparable<K>>
        implements INode<K> {

    private K key;

    private INode<K> left;
    private INode<K> right;

    public BinaryNode(K key) {

        this.key = key;
    }

    @Override
    public K getKey() {

        return key;
    }

    @Override
    public INode<K> getLeft() {

        return left;
    }

    @Override
    public INode<K> getRight() {

        return right;
    }

    @Override
    public void setLeft(INode<K> left) {

        this.left = left;
    }

    @Override
    public void setRight(INode<K> right) {

        this.right = right;
    }
}