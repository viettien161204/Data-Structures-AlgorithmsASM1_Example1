import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LinkedListADT {
    public List<String> createLinkList(){
        List<String> animal = new LinkedList<>();
        Queue<Integer> animal2 = new LinkedList<>();
        Deque<String> animal3= new LinkedList<>();
        LinkedList<String> animal4 = new LinkedList<>();
        return animal;

    }
    public void addElement(List<String> animal){
        animal.add("cat");
        animal.add("dog");
        animal.add("tiger");
        animal.add("lion");
        System.out.println("LinkList :"+animal);
    }
    public void addElementByIndex(List<String> animal, int Index, String value){
        animal.add(Index, value);
        System.out.println("link list after data" + animal);
    }
    public void getElementByIndex(List<String> animal,int Index){
        String value = animal.get(Index);
        System.out.println("gia tri index tra ve la "+Index+"la:"+value);
    }
    public void changeDataElement(List<String> animal, int Index, String data){
        animal.set(Index, data);
        System.out.println("linked list after update"+animal);
    }
    public void removeDataElement(List<String> animal, int Index){
        animal.remove(Index);
        System.out.println("linked list after remove"+animal);
    }
    public void findDataElement(List<String> animal, String data){   //constant tra ve true or false
        boolean checking = animal.contains(data);
        if (checking == true)
            System.out.println(data + "found");
        else
            System.out.println(data + "not found");

    }
    public void findElement(List<String> animal, String data){      // indexOf tra ve vi tri tu cuoi len
        int position = animal.indexOf(data);
        if (position ==-1)
            System.out.println(data + "not found");
        else
            System.out.println(data + "found at"+position);
    }
    public void findElement1(List<String> animal, String data){      // Last indexOf tra ve vi tri tu dau xuong
        int position = animal.lastIndexOf(data);
        if (position ==-1)
            System.out.println(data + "not found");
        else
            System.out.println(data + "found at"+position);
    }
    public void loopElement(List<String> animal){
        int size = animal.size();
        for (int i = 0 ; i<size ;i++){
            System.out.println("vaule of element is " + animal.get(i));
        }
    }



}
