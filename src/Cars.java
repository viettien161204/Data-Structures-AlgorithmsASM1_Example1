public class Cars {
    //field (dinh nghia thuoc tinh)
    public String name = "BMV";
    private int weight;
    protected float money= 100;

    public Cars(int weightCar){
        //constructor
        //tu dong chay dau tien khi ma khoi tao doi tuong
        System.out.println("constructor is running");
        this.weight = weightCar;
    }
    //method (dinh nghia phuong thuc)
    public String start(String place){
        return place ;
    }
    public String start(){
        return this.name;
    }
    public  String stop(){
        return  "myHome";
    }

}
