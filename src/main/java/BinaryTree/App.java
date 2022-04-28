package BinaryTree;

import LinkedList.LinkedList;

public class App {

    public static void main(String[] args) {


        // O(N)   OR  O(logN)
    /*    Tree<Integer> bst = new BinarySearchTree<>();

        bst.insert(27);
        bst.insert(2);
        bst.insert(3);
        bst.insert(6);



        Tree<Integer> bst2 = new BinarySearchTree<>();

        bst2.insert(27);
        bst2.insert(1);
        bst2.insert(3);
        bst2.insert(6);

        TreeCompareHelper<Integer> helper = new TreeCompareHelper<>();
       System.out.println(helper.compareTrees(bst.getRoot(), bst2.getRoot()));
      */

       Tree<Person> bst = new BinarySearchTree<>();

        bst.insert(new Person("Adam", 23));
        bst.insert(new Person("Viki", 5));
        bst.insert(new Person("Lisa", 3));
        bst.insert(new Person("Monika", 1));

        System.out.println(bst.getAgesSum());
        bst.traversal();




    }
}
