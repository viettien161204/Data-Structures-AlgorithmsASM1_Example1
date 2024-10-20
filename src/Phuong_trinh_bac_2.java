public class Phuong_trinh_bac_2 {
    private double hsa;
    private double hsb;
    private double hsc;

    public Phuong_trinh_bac_2(double a, double b, double c){
        hsa = a;
        hsb = b;
        hsc = c;


    }
    private String giaiPT(){
        double detal = Math.pow(2,hsb) - 4 * hsa * hsc;
        String result ;
        if(detal<0){
            result = "pt vo nghiem";
        } else if (detal ==0 ){
            result = "pt 1 co nghiem la" + (-hsb/2*hsa);
        }else {
            double x1 = (-hsb + Math.sqrt(detal)) / (2*hsa);
            double x2 = (-hsb - Math.sqrt(detal)) / (2*hsa);
            result = "pt co 2 nghiem la x1 = " + x1 +" x2 = " + x2;
        }
        return result;
    }
    public void showResult(){
        String res = giaiPT();
        System.out.println(res);
    }
}
