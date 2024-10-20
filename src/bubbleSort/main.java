package bubbleSort;
import java.util.Arrays;
public class main {
    public static void main(String[] args) {
        selectionSort ss = new  selectionSort();
        int[] random = {1,3,2,9,6,4,8,5};
        ss.sorting(random);
        ss.showArray(random);
        //        bubbleSort bbs = new bubbleSort();
//        int[] random = {1,3,2,9,6,4,8,5};
//        bbs.sorting(random);
//        bbs.printArray(random);


//        InsertionSort insertionSort = new InsertionSort();
//        int[] random = {1,3,2,9,6,4,8,5};
//        insertionSort.sorting(random);
//        insertionSort.showArray(random);

//        int[] random = {1,3,2,9,6,4,8,5};
//        MergeSort mergeSort = new MergeSort();
//        mergeSort.merge(random, 0,random.length-1);
//        mergeSort.showArray(random);


//        int[] data = { 8, 7, 2, 1, 0, 9, 6 };
//        System.out.println("Unsorted Array");
//        System.out.println(Arrays.toString(data));
//
//        int size = data.length;
//
//        // call quicksort() on array data
//        QuickSort.quickSort(data, 0, size - 1);
//
//        System.out.println("Sorted Array in Ascending Order: ");
//        System.out.println(Arrays.toString(data));

    }
}
