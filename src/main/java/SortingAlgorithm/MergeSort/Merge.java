package SortingAlgorithm.MergeSort;

import SortingAlgorithm.Insertionsort.InsertionSort;

public class Merge {

    public static void main(String[] args){

        int[] nums = {2,7,3,4,6};
        MergeSort sort = new MergeSort(nums);

        sort.sort();
        sort.showArray();

    }
}
