package Task3;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();
        final var sb_physics = new Subject("Фізика");
        final var sb_english = new Subject("Англійська мова");
        final var sb_math = new Subject("Математика");

        final Set<Subject> subjects = new HashSet<Subject>(Arrays.asList(
                sb_physics,
                sb_english,
                sb_math
        ));

        Student student = new Student("AAA","Vladyslav","Denysovych","Bychkov","IT12"
                ,new HashSet<Mark>(Arrays.asList(
                new Mark(5, sb_physics),
                new Mark(4, sb_english),
                new Mark(4, sb_math))));
        Student student2 = new Student("BBB","Egor","Sergijovych","Egorov","IT13"
                ,new HashSet<Mark>(Arrays.asList(
                new Mark(3, sb_physics),
                new Mark(3, sb_english),
                new Mark(2, sb_math))));
        Student student3 = new Student("CCC","Maria","Viktorovna","Bychkova","IT14"
                ,new HashSet<Mark>(Arrays.asList(
                new Mark(5, sb_physics),
                new Mark(5, sb_english),
                new Mark(5, sb_math))));
        Student student4 = new Student("DDD","Denys","Alexandrovych","Kowalski","IT15"
                ,new HashSet<Mark>(Arrays.asList(
                new Mark(2, sb_physics),
                new Mark(3, sb_english),
                new Mark(2, sb_math))));

        students.add(student);
        students.add(student2);
        students.add(student3);
        students.add(student4);

        StudentSimpleList a = new StudentSimpleList();
        a.studentToSimple(students);
//        a.display();
        a.delLessThan3();
//        a.display();
//          System.out.println(a.prizvishe());
//          System.out.println( a.getBestStudent());
//        a.sortuvannia();
        a.display();

        System.out.println(a.convertStudentMarksBySubject(a.getStudentsMarksBySubject(sb_english)));


    }
}
