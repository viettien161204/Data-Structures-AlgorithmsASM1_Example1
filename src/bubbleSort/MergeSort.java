package bubbleSort;

public class MergeSort {
    public void sorting(int[] arr, int p, int q, int r){
        //tinh so luong phan tu
        int n1 = q-p +1; //midle -left +1
        int n2 = r-q;//right -midle
        //tao mang ben trai va tao mang ben phai
        int[] L = new int [n1];//tao mang so luong phan tu ben trai
        int[] R = new int [n2];//tao mang so luong phan tu ben phai
        //do cac phan tu vao mang trai, phai
        for(int i =0; i<n1; i++){
            L[i] = arr[p+i];
        }
        for (int j = 0; j<n2;j++){
            R[j] = arr[q+1+j];
        }
        int i,j,k ;
        i =0; j=0; k=p;
        while (i < n1 && j < n2){
            if(L[i]<R[j]){
                arr[k] = L[i];
                i++;
            }else {
                arr[k]= R[j];
                j++;
            }
            k++;
        }
        while (i < n1){
            arr[k] = L[i];
            i++;
            k++;

        }
        while (j< n2){
            arr[k] = R[j];
            j++;
            k++;
        }


    }
    public void merge(int[] arr, int left, int right){
        //left vi tri cua cac phan tu mang ben trai(tinh tu 0)
        //right vi tri cua cac phan tu mang ben phai( lenght -1)
        if(left < right){
            int middle = (left +right)/2; //vi tri de chia mang
            //de quy ( goi la ham no trong chinh no)
            merge(arr, left, middle); //tinh mang ben trai
            merge(arr,middle +1 , right); //tinh mang ben phai
            //sau khi chia mang thi hop lai sap xep
            sorting(arr, left, middle, right);
        }

    }
    public void showArray(int[] arrayNumbers){
        for (int i = 0; i<arrayNumbers.length;i++){
            System.out.println("key" + i + "; item = "+ arrayNumbers[i]);
        }

    }

}
