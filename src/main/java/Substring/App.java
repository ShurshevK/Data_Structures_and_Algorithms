package Substring;


import Substring.RabinKarb.RabinKarp;

public class App {

    public static void main(String[] args) {

        RabinKarp algorithm = new RabinKarp();
        System.out.println(algorithm.search("dadsad", "sad"));
    }
}
