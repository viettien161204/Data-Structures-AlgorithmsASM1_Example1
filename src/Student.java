public class Student {
    public String id;
    public String name;
    public int age;
    public String address;


    public Student(String _id, String _name, String _address, int _age){
        id = _id;
        name = _name;
        address= _address;
        age = _age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



}
