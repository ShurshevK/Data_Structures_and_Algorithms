package String;


import String.RabinKarb.RabinKarp;
import String.BruteForce.BruteForceSearch;

public class App {

    public static void main(String[] args) {

        RabinKarp algorithm = new RabinKarp();
        System.out.println(algorithm.search("dadsad", "sad"));
    }
}
