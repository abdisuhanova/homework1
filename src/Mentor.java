import java.util.ArrayList;

public class Mentor extends  Person {
    ArrayList<Student> students = new ArrayList<Student>();
    public Mentor(String name, int age){
        super(name, age);
    }
    public void takeAnExam(){
        for (int i = 0; i < students.size(); i++){
            students.get(i).explain();
        }
    }
    public void addStudent(Student student){
        students.add(student);
    }
}
