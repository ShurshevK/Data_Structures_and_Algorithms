package FenwickTreeBinaryIndexedTree;

public class FenwickTree {

    private int[] fenwickTree;

    public FenwickTree(int[] nums) {

        // the constructed Fenwick tree (first item is 0  other size is greater)
        // initialize the values to be 0
        this.fenwickTree = new int[nums.length+1];
        construct(nums);
    }

    public int rangeSum(int startIndex, int endIndex){
        return sum(endIndex)-sum(startIndex-1);
    }

    private int sum(int index) {
        // index start with 0 but in the theory/implement we start with 1
        index ++;
        // the final result (so the sum of the integers
        int sum = 0;

        // we may consider the sum of the multiple ranges, so we have to iterate until index>0
        while(index>0){

            //binary index tree contains the sums if the given ranges
            sum = sum + this.fenwickTree[index];
            index = parent(index);
        }

        return sum;
    }

    private int parent(int index) {
        return index + (index&-index);
    }

    //constructing the Fenwick tree from the original array of integers
    //O(NlogN) running time complexity
    private void construct(int[] nums){
        //consider all the items in the original array
        for (int index=1; index<nums.length;++index){
            update(index, nums[index-1]);
        }
    }

    private void update(int index, int num) {

        // have to check all the ranges that include the index

        while( index<this.fenwickTree.length){
            this.fenwickTree[index]+=num;

            //index of the items on the right
            index = next(index);
        }
    }
    // index of the item on the left
    //O(1) running
    private int next(int index) {
        return  index+(index&-index);

    }


}
