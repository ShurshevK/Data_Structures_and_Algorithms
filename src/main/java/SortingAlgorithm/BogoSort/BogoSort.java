package SortingAlgorithm.BogoSort;

public class BogoSort {

     public int[] nums;
     private int counter;

    public BogoSort(int[] nums) {
        this.nums = nums;
    }

    public void sort(){
        while(!isSorted()){
            counter++;
            shuffle();

        }
        showSortedArray();

    }

    private void showSortedArray() {
        System.out.println("Number of iterations: "+ counter);
        for(int i=0; i<nums.length-1;++i)
            System.out.print(nums[i]+" ");
    }

    // in-place algorithm
    private void shuffle() {
        // consider the items in reversed order
        for(int i=nums.length-1; i>=0;i--){
            int j = (int) (Math.random() * i);
            swap(i , j);
        }
    }

    private void swap(int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private boolean isSorted() {
        // Auto-generate method stub
        // the array cannot be sorted in ascending order
        for(int i=0; i<nums.length-1; ++i)
            if(nums[i+1]<nums[i])
                return false;

        return true;
    }
}
