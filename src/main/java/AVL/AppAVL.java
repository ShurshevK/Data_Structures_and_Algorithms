package AVL;



public class AppAVL {

    public static void main(String[] args) {

        Tree avl = new AvlTree();

        avl.insert(10);
        avl.insert(15);
        avl.insert(5);
        avl.insert(6);

        avl.delete(15);

        avl.traverse();
    }
}
