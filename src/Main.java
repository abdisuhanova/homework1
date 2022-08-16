import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        Random r = new Random();
        Student student1 = new Student("Manzura",16),
                student2 = new Student("Azizbek", 17),
                student3 = new Student("Muratbek", 18),
                student4 = new Student("Bakhtiyar", 20),
                student5 = new Student("Aziza", 19),
                student6 = new Student("Taalay", 16),
                student7 = new Student("Vasiliy", 21),
                student8 = new Student("Kubanych", 20),
                student9 = new Student("Kanykey", 22),
                student10 = new Student("Emil", 26),
                student11 = new Student("Nurila",35),
                student12 = new Student("Rysbek",40),
                student13 = new Student("Eldiyar",23),
                student14 = new Student("Anarkul", 20),
                student15 = new Student("James", 19),
                student16 = new Student("Mary", 41),
                student17 = new Student("Rober", 25),
                student18 = new Student("Patricia", 26),
                student19 = new Student("Nurlanbek", 23),
                student20 = new Student("Gulsara", 22),
                student21 = new Student("Timur", 26),
                student22 = new Student("Igor", 36),
                student23 = new Student("Oleg", 33),
                student24 = new Student("Ivan", 34),
                student25 = new Student("Alina", 45),
                student26 = new Student("Asylbek", 25),
                student27 = new Student("Tilek", 54),
                student28 = new Student("Zhenishbek", 19),
                student29 = new Student("Samat", 18),
                student30 = new Student("Bolotbek", 17),
                student31 = new Student("Erkin", 19),
                student32 = new Student("Kanat", 26),
                student33 = new Student("Urmat", 18),
                student34 = new Student("Madina", 16),
                student35 = new Student("Mavlyuda", 24),
                student36 = new Student("Vera", 16),
                student37 = new Student("Ermek", 18),
                student38 = new Student("Kanatbek", 53),
                student39 = new Student("Aleksey", 48),
                student40 = new Student("Evgeniy", 28);
        Student[] students = {
                student1, student2, student3, student4,
                student5, student6, student7, student8,
                student9, student10, student11, student12,
                student13, student14, student15, student16,
                student17, student18, student19, student20,
                student21, student22, student23, student24,
                student25, student26, student27, student28,
                student29, student30, student31, student32,
                student33, student34, student35, student36,
                student37, student38, student39, student40
        };

        Mentor mentor1 = new Mentor("Muhammed", 22);
        Mentor mentor2 = new Mentor("Zhanarbek", 22);
        Mentor mentor3 = new Mentor("Samarbek", 19);
        Mentor mentor4 = new Mentor("Zhazgul", 25);
        Mentor[] mentors = {mentor1, mentor2, mentor3, mentor4};
        int random, count = 0;

        for (Student s : students){

            while (true){
                random = r.nextInt(0, 4);
                if (mentors[random].students.size() < Math.round(students.length/mentors.length)){
                    mentors[random].addStudent(s);
                    count++;
                    System.out.println(count + " " + mentors[random].getName() + " " + s.getName() + s.getAge());
                    break;
                }
            }
        }
    }
}