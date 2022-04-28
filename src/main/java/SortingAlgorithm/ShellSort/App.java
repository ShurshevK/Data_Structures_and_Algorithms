package SortingAlgorithm.ShellSort;

import SortingAlgorithm.SelectionSort.SelectionSort;

public class App {

    public static void main(String[] args){

        int[] nums = {2,7,3,4,6};
        ShellSort sort = new ShellSort(nums);

        sort.sort();
        sort.showArray();

    }
}
