package BinaryTree;

public interface Tree<T> {
    public Node<T> getRoot();
    public Node<T> getKSmallest(Node<T> node, int k);
    public int getAgesSum();
    public void traversal();
    public void insert(T data);
    public void delete(T data);
    public T getMaxValue();
    public T getMinValue();
}
