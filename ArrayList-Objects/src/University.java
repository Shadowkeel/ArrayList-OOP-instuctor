import java.util.ArrayList;

public class University {
    private String name;
    private ArrayList<Student> students;

    public University(String name) {
        this.name = name;
        students=new ArrayList<>();
    }
 public void addStudent(Student student){
students.add(student);
     System.out.println(student.getName()+" added");
 }
    @Override
    public String toString() {
        return "University{" +
                "name='" + name + '\'' +
                ", students=" + students.toString() +
                '}';
    }
}
