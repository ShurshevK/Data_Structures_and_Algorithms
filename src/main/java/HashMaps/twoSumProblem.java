package HashMaps;

import java.util.HashMap;
import java.util.Map;

public class twoSumProblem {

    private int[] nums;
    private int S;
    private Map<Integer, Integer> hashTable;



    public twoSumProblem(int s, int[] nums) {
        this.S = s;
        this.hashTable = new HashMap<>();
        this.nums = nums;


    }
    public void solve(){

        for(int i=0;i<nums.length;++i){


            int remainder = S - nums[i];
            System.out.println(remainder);

            if(hashTable.containsValue(remainder))
                System.out.println("Solution: "+nums[i]+"+"+remainder+"="+S);


            hashTable.put(i, nums[i]);
            System.out.println(hashTable);

        }

    }

}
