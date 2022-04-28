package SortingAlgorithm.QuickSort;

import SortingAlgorithm.Insertionsort.InsertionSort;

public class App {

    public static void main(String[] args){

        int[] nums = {2,7,3,4,6};
        QuickSort sort = new QuickSort(nums);

        sort.sort();
        sort.showArray();

    }
}
