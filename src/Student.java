public class Student {
    private String name;
    private String surname;
    private int age;
    String[] course;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public  int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String[] getCourse(){
        return course;
    }
    public void setCourse(String[] course){
        this.course = course;
    }
}
