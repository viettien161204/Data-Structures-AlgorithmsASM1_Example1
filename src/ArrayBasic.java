public class ArrayBasic {
    public void showArray() {
        // tao 1 mang so
        // khai bao mang - biet luon so luong phan tu va ca gia tri cua phan tu do
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        //khai bao mang - chi can biet so luong la bao nhieu(khong can biet ro gia tri cua tung mang la gi)
        int[] myNumber = new int [4];
        // khi khai bao mang - luon luon khai bao kich thuoc cua mang(luon luon co dinh, khong thay doi)
        // truy cap vao 1 phan tu trong mang(lay ra 1 gia tri cua 1 phan tu trong Array)
        // cú pháp :NameArray[index]
        int n = numbers[7];
        System.out.println("My numbers:"+ n);
        //duyệt mảng(duyệt qua tất cả các phần tử nằm trong mảng)
        // cách 1 - for ...
        int lengthArr = numbers.length; // kiểm tra số lượng phần tử
        for (int i = 0; i < lengthArr; i++) {
            System.out.println("value = " + numbers[i]);
        }
        // cách 2 - forEach
        for (int j : numbers) {
            System.out.println("giá trị j = " + j);
        }

        // cách 3 - while
        int k = 0;
        while (k < numbers.length) {
            System.out.println("phần tử k = "+ numbers[k]);
            k++;
        }

        int L = 0;
        do{
            System.out.println("giá trị phần tử L = " + numbers[L]);
            L++;
        } while (L < lengthArr);


    }
    public int maxNumberInArray(int[] number){
        int max = number[0]; //lay ra phan tu dau tien va gia su la phan tu lon nhat
        for (int i = 1; i<number.length; i++){
            if(number[i] > max)
                max = number[i];
        }
        return (max);


    }
    public int minNumberInArray(int[] number){
        int min = number[0]; //lay ra phan tu dau tien va gia su la phan tu nho nhat
        for (int i = 1; i<number.length; i++){
            if(number[i] < min)
                min = number[i];
        }
        return (min);


    }
    private boolean checkSNT(int number ){

        if(number <= 1){
            return false;
        }
        if(number ==2 ){
            return true;
        }
        for (int i =2; i<=Math.sqrt(number);i++){
            if (number % i ==0){
                return false;
            }
        }
        return true;


    }
    public int TongSNT (int[] arrNumbers){
        int tong = 0;
        for (int number  :arrNumbers){
            if( checkSNT(number)){
                tong+=number;
            }

        }
        return tong;
    }

    public int countNumber (int[] arrNumbers){
        int count = 0 ;
        for (int number : arrNumbers){
            if (checkSNT(number)){
                count++;
            }

        }
        return count;
    }

}