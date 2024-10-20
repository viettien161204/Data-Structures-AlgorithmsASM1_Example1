package bubbleSort;

public class bubbleSort {
   public void sorting(int[] numbers){
       int sizeArray= numbers.length;  // kich thuoc mang sap xep
       for (int i =0 ; i<sizeArray -1; i++){
           for(int j =0 ; j < sizeArray -i-1; i++){
               if(numbers[i] > numbers[i+ 1]){
                    int temp = numbers[i];
                    numbers[i] = numbers[i+1];
                    numbers[i+1] = temp;


               }
           }
       }
    }
    public void printArray(int [] numbers){
       for (int item : numbers){
           System.out.println(item);
       }
    }
}
