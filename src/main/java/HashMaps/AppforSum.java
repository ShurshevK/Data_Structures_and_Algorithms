package HashMaps;

public class AppforSum {

    public static void  main(String[] args){
        int[] nums = {2,3,5,6,7};
        int S = 5;

        twoSumProblem twoSumProblem = new twoSumProblem(S, nums);
        twoSumProblem.solve();
    }
}
