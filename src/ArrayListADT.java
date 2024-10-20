import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListADT {
    public List<String> createArrayList(){
        List<String> animal  = new ArrayList<>();
        //ArrayList<String>fruits= new ArrayList<>();
       animal.add("dog");
       animal.add("chicken");
       animal.add("tiger");
       animal.add("mouse");
        return animal;
    }
    public void showArrayList(List<String> MyArrayList ){
        System.out.println("array list : " + MyArrayList);
    }
    public void getElement(List<String> list, int Index){
        String data = list.get(Index);
        System.out.println(data );
    }
    public void changeData(List<String> list, int Index, String vaule){
        list.set(Index, vaule);
        System.out.println("array list before change "+ list);
    }
    public void getSize(List<String> list){
        int size = list.size();
        System.out.println("size of array list : "+ size);
    }
    public void removeElement(List<String> list, int Index){
        list.remove(Index);
        System.out.println("array list before change remove : " +list);
    }

    public void loopElement(List<String> list){
        for (String item : list){
            System.out.println("element : " +item);
        }
    }
}
