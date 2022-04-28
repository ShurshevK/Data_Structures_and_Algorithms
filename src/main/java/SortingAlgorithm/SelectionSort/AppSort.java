package SortingAlgorithm.SelectionSort;

import SortingAlgorithm.BubleSort.BubleSort;

public class AppSort {

    public static void main(String[] args){

        int[] nums = {2,7,3,4,6};
        SelectionSort sort = new SelectionSort(nums);

        sort.sort();
        sort.showArray();

    }
}
