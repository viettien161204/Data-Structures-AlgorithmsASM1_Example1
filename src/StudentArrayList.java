import java.util.ArrayList;
import java.util.List;

public class StudentArrayList {
    public void createDataStudent(Student student, ArrayList<Student> arrayList){
        arrayList.add(student);

    }
    public boolean findStudentById(ArrayList<Student> students,String Id){

       for (Student student : students){
           if (student.getId().equals(Id)){
               return true;
           }
       }
       return false;
    }

    public boolean updateNameStudent (ArrayList<Student> students,String Id ,String nameStudent){

        for (int i =0; i<students.size(); i++){
            if (students.get(i).getId().equals(Id)){
                students.get(i).setName(nameStudent);
                return true;
            }
        }
        return false;
    }
    public boolean removeStudent (ArrayList<Student> students,String Id){
        for (int i =0; i<students.size(); i++){
            if (students.get(i).getId().equals(Id)){
                students.remove(i);
                return true;
            }
        }
        return false;
    }
    public void showStudents(ArrayList<Student> students){
        for (Student item : students){
            System.out.println("ID = " + item.getId() + ", name = " + item.getName());
        }
    }

}
