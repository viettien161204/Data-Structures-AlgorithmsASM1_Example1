package bubbleSort;

public class InsertionSort {
    public void sorting(int[] numbers){
        int size = numbers.length;
        for (int i =0 ; i< size; i++){
            int key = numbers[i];
            int j = i-1;
            while (j >= 0 && key <j){
                numbers[j+1] = numbers[j];
                j--;
            }
            numbers[j+1] = key;
        }
    }
    public void showArray(int[] arrayNumbers){
        for (int i = 0; i<arrayNumbers.length;i++){
            System.out.println("key" + i + "; item = "+ arrayNumbers[i]);
        }

    }
}
