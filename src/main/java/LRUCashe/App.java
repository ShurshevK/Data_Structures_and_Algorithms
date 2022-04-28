package LRUCashe;

public class App {

    public static void main(String[] args){

        LRUCache name = new LRUCache();
        name.put(0, "A");
        name.put(1, "B");
        name.put(2, "AC");
        name.put(3, "DE");

        System.out.println(name.get(2));
        name.show();
        System.out.println();

        System.out.println(name.get(1));
        name.show();
        System.out.println();

    }
}
