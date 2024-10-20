package Recursion;

public class Recursion {
    public static void  countNumberNonRecursion( int number){
        if(number < 0 ){
            return;
        }
        for (int i= 1; i <=number; i++ ){
            System.out.println("number = " +i);
        }
    }
    public static void  countNumberWithRecursion( int number2, int m){

        if(number2 > m){
           return; //buoc khu de quy

        }
        System.out.println(number2);
        number2 += 1;
        countNumberWithRecursion(number2,m);
    }

    public static void fatorialNonRecursion(int n3){
        if ( n3 < 0){
            System.out.println("nhap sai");
        }
        else if (n3==1||n3==0){
            System.out.println("result = 1");
        }
       else {
            int result = 1 ;
            for (int i =1; i<=n3; i++){
                result *=i;
            }
            System.out.println("result = " +result);
        }


    }
    public static long fatorialWithRecursion(int n4){
        if (n4<0){
            return 0;
        }
        if (n4 ==1|| n4 == 0){
            return 1;
        }
        return n4* fatorialWithRecursion(n4-1);

    }


}
