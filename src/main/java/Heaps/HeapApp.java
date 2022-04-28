package Heaps;

public class HeapApp {
    public static void main(String[] args) {

        Heap heap = new Heap(10);

        heap.insert(10);
        heap.insert(100);
        heap.insert(-10);


        heap.heapsort();
        System.out.println();
        System.out.println(heap.getMin());


        int [] maxHeap = {210, 100, 20 ,1, -1};

        HeapConverter heapConverter = new HeapConverter(maxHeap);

        int[] minHeap = heapConverter.transform();

        for (int j : minHeap) System.out.println(j + "");



    }
}
