package RedBlackTree;


public class AppRBTree {

    public static void main(String[] args) {

        RBTree tree = new RBTree();

        tree.insert(10);
        tree.traverseGraph();
        tree.insert(20);
        tree.traverseGraph();
        tree.insert(30);
        tree.traverseGraph();
        tree.insert(15);

        tree.traverseGraph();
    }
}
