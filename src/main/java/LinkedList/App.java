package LinkedList;

import DoublyLinkeddList.DoubleLinkedList;

public class App {

    public static void main(String[] args){

        LinkedList name = new LinkedList<>();
        name.insert("Adam");
        name.insert("Keyll");
        name.insert("Susi");
        name.insert("Amar");
        name.traverseList();
        name.reverse();
        name.traverseList();

        System.out.println(name.getMiddleNode());
    }
}
