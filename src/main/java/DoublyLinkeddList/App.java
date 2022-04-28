package DoublyLinkeddList;

public class App {

    public static void main(String[] args){

        DoubleLinkedList<String> name = new DoubleLinkedList<>();
        name.insert("Adam");
        name.insert("Keyll");
        name.insert("Susi");
        name.insert("Amar");
        name.traverseBackword();
    }
}
