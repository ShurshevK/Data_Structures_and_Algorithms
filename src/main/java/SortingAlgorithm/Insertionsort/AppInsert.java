package SortingAlgorithm.Insertionsort;

import SortingAlgorithm.SelectionSort.SelectionSort;

public class AppInsert {

    public static void main(String[] args){

        int[] nums = {2,7,3,4,6};
        InsertionSort sort = new InsertionSort(nums);

        sort.sort();
        sort.showArray();

    }
}
