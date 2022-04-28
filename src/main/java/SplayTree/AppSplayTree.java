package SplayTree;

public class AppSplayTree {

    public static void main(String[] args) {

        Tree<Integer> splayTree = new SplayTree<Integer>();

        splayTree.insert(10);
        splayTree.insert(0);
        splayTree.insert(234);
        splayTree.insert(-3);
        splayTree.insert(23);
        splayTree.insert(-56);
        splayTree.insert(78);

        splayTree.find(10);
        System.out.println(splayTree.getRoot());

    }
}
