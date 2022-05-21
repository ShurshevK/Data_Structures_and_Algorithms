package Array;

import LinkedList.LinkedList;


public class Array {
    public static void main(String[] args){
       /*
       int[] nums = {1,2,3,5};
        ReverseArrayProblem reverseArrayProblem = new ReverseArrayProblem();
        System.out.println(Arrays.toString(reverseArrayProblem.solve(nums)));
      */
        /*
        Anagram anagram = new Anagram();
        System.out.println(anagram.solve("restful".toLowerCase(Locale.ROOT).toCharArray(), "fluster".toLowerCase(Locale.ROOT).toCharArray()));
    */
      /*
        palindrom palindrom = new palindrom();
        System.out.println(palindrom.solve("madam"));

       */
        /*
        IntegerReversion integerReversion = new IntegerReversion();
        System.out.println(integerReversion.reverse(12345657));

         */
/*
        int[] nums = {2,2,0,1,2};
        DutchFlagProblem problem = new DutchFlagProblem(nums);
        problem.solve();
        problem.showResult();


        int[] nums = {1,1,2,3,1,2,3,2,1};

        TrappingWater trappingWater = new TrappingWater();
        System.out.println(trappingWater.solve(nums));

*/
        LinkedList myLinkedList = new LinkedList();
        myLinkedList.insert("adam");
        myLinkedList.insert(2);
        myLinkedList.insert(3);
        myLinkedList.insert(4);

        myLinkedList.traverseList();


    }
}
