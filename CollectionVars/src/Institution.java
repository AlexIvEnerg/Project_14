import java.util.HashSet;
import java.util.Set;

public class Institution {
    public static void main(String[] args) {
        Set<Student> group1 = new HashSet<>();
        group1.add(new Student("Andrey","mechanic", 1, 4));
        group1.add(new Student("Jack", "mechanic", 2, 5));
        group1.add(new Student("Nix", "electric", 2, 4));
        group1.add(new Student("Fillip", "auto", 1, 5));
        group1.add(new Student("Antoon", "electric", 1, 3));
        exceptOfStudWithMissScore(group1);
        for (Student stud : group1) {
            transferOfStudToTheNextCour(stud);
        }
        printStudents(group1, 2);

    }

    public static void exceptOfStudWithMissScore(Set<Student> students) {
        students.removeIf(student -> student.aver_score<3);
    }

    public static void transferOfStudToTheNextCour(Student student) {
        if (student.aver_score >= 3) student.course ++;
    }

    public static void printStudents(Set<Student> group, int course) {  // course - выбранный курс
        for (Student student : group) {
            if (student.course == course) System.out.print(student.name + ", ");
        }
    }
}
