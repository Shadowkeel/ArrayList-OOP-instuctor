import java.util.ArrayList;

public class Student {
    private int id;
    private String name;
    private String dob;
     private ArrayList<Course> courses;

    public Student(int id, String name, String dob) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        courses=new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void addCourse(Course course){
        courses.add(course);
    }
    public void dropCourse(Course course){
  courses.remove(course);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dob='" + dob + '\'' +
                ", courses=" + courses.toString() +
                '}';
    }
}
