package bubbleSort;

public class selectionSort {
    public void sorting(int[] numbers){
        int size = numbers.length;
        for(int i = 0; i<size -1; i++){
            int min = i;
            for (int j = i + 1; j <size; j++) {
                if (numbers[j] < numbers[min]) {
                    min = j;
                }
            }
            swap(numbers, i, min);
        }
    }
    public void swap(int[] numbers, int i , int j){
        if (i != j) {

            int temp = numbers[i];
            numbers[i] =   numbers[j];
            numbers[j] = temp;

        }
    }
    public void showArray(int[] arrayNumbers){
        for (int i = 0; i<arrayNumbers.length;i++){
            System.out.println("key" + i + "; item = "+ arrayNumbers[i]);
        }

    }
}
