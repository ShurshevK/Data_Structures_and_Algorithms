package Trie;

class test {
    public int maxSubArray(int[] nums) {

        int max = nums[0];

        for(int i=1;i<nums.length;i++){
            System.out.println("index " +i);
            nums[i] = Math.max(nums[i], nums[i]+nums[i-1]);
            System.out.println(nums[i]);
            max = Math.max(max, nums[i]);
            System.out.println(max);
        }
        return max;

    }
}
