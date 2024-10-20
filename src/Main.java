import bubbleSort.bubbleSort;

import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
       // System.out.println("Hello and welcome!");
//        //khai báo bi
//        //cu phap : <data type> <name>
//        String myname =  "tien";
//        int age = 20;
//        System.out.println("my name is " + myname);
//        System.out.println("my age is " + age);
//
//        //bien k duoc phep bat dau tu 1 con so
//        //int 90age ; //sai
//        // khong dc trung cac tu khoa trong lap trinh
//        //String while; //sai
//        //bien phan biet chu hoa va chu thuong
//        //tieu chuan de dat ten bien trong jave
//        // chuan : ap dung camel-case
//        String myEmail = "nguyenviettien161204@gmail.com"; //
//
//        Scanner scanner = new Scanner(System.in);
////        System.out.println("moi ban nhap so");
////        int number = scanner.nextInt();
////        System.out.printf("so vua nhap la %d", number);
//        System.out.printf("moi nhap ho ten :");
//        String name = scanner.nextLine();
//       System.out.printf("ho ten cua ban la :"+ name);




//        //khoi tao doi tuong
//        Cars car = new Cars(100); //khoi tao doi tuong
//        Cars car2 = new Cars(200);
//        //truy cap vao thuoc tinh hay puong thuc cua doi tuong class
//        String nameCar = car.name;
//        String stopCar = car2.stop();
//
//        System.out.println("name car is:" + nameCar);
//        System.out.println("car stop on :" +  stopCar);

//      ArrayBasic arr = new ArrayBasic();
//      int[] radNumber = {2,3,5,11};
//
//
//        int tong = arr.TongSNT(radNumber);
//        System.out.println("tong cac sont trong mang la" + tong);
//        int count = arr.countNumber(radNumber);
//        System.out.println("TBc cua so nt trong dayx laf" +(double) tong / count );


//        LinkedListADT list = new LinkedListADT();
//        List<String> data = list.createLinkList();
//        list.addElement(data);
//        list.addElementByIndex(data, 2,"donkey");
//        list.getElementByIndex(data,3);
//        list.changeDataElement(data,4,"bird");
//        list.removeDataElement(data,1);
//        list.findDataElement(data, "cat");//constants
//        list.findElement(data, "tiger");//indexOf
//        list.findElement1(data,"donkey");//LastindexOf
//        list.loopElement(data);




//        stackADT stack = new stackADT();
//        Stack<Integer> dataNumber = stack.createStack();
//        stack.displayStack(dataNumber);
//        stack.removeElement(dataNumber);
//        stack.peekElement(dataNumber);
//        stack.countElement(dataNumber);
//        stack.fineElement(dataNumber, 4);
//        stack.isEmptyStack(dataNumber);
//        stack.loopElement(dataNumber);
//       stack.testStackFull(dataNumber);


        queueADT queue = new queueADT();
        Queue<String> dataColor = queue.createQueue();
        queue.showQueue(dataColor);
        queue.insertDataQueue(dataColor);
//        queue.checkSize(dataColor);
        queue.checkEmpty(dataColor);
//        queue.getElementQueue(dataColor);
//        queue.getElementQueue2(dataColor);
//        queue.removeElement(dataColor);
//        queue.showQueue(dataColor);
//        queue.removeElement2(dataColor);
//        queue.showQueue(dataColor);
//        queue.loopElement(dataColor);

        queue.addToQueue(dataColor, "pink");
        queue.addToQueue(dataColor, "brown");
        queue.addToQueue(dataColor, "yellow");
        queue.addToQueue(dataColor, "yellow");
        queue.addToQueue(dataColor, "yellow");



//        ArrayListADT arrayList = new ArrayListADT();
//        List<String> arrayListData = arrayList.createArrayList();
//        arrayList.showArrayList(arrayListData);
//        arrayList.getElement(arrayListData, 1);
//        arrayList.changeData(arrayListData, 2, "monkey");
//        arrayList.getSize(arrayListData);
//        arrayList.removeElement(arrayListData, 3);
//        arrayList.loopElement(arrayListData);


//        Student st1 = new Student("bh001", "tien", "HaNoi",20);
//        Student st2 = new Student("bh002", "teo", "HaNoi",30);
//        Student st3 = new Student("bh003", "diddy", "HCM",50);
//        Student st4 = new Student("bh004", "JustinBiaHoi", "HCM",25);
//        ArrayList<Student> dataST = new ArrayList<>();
//        StudentArrayList studentArrayList = new StudentArrayList();
//        studentArrayList.createDataStudent(st1, dataST );
//        studentArrayList.createDataStudent(st2, dataST );
//        studentArrayList.createDataStudent(st3, dataST );
//        studentArrayList.createDataStudent(st4, dataST );
//
//        studentArrayList.updateNameStudent(dataST,"bh002" ,"thuy");
//        studentArrayList.showStudents(dataST);
//
//        studentArrayList.removeStudent(dataST, "bh003");
//        studentArrayList.showStudents(dataST);
//
//        boolean CheckingST = studentArrayList.findStudentById(dataST, "bh004");
//        if (CheckingST) {
//            System.out.println("found it");
//
//        }
//        else
//            System.out.println("not found");






        }






    }
