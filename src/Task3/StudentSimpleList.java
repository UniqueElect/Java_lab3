package Task3;

import java.util.*;
import java.util.stream.Collectors;

public class StudentSimpleList {


    private List<StudentSimple> simpleS = new ArrayList<>();

    public void studentToSimple(List<Student> students) {

        for (int i = 0; i < students.size(); i++) {
            StudentSimple studentS = new StudentSimple();
            simpleS.add(studentS);

            studentS.setId(students.get(i).getId());
            studentS.setName(students.get(i).getName());
            studentS.setSurname(students.get(i).getSurname());
            studentS.setLastname(students.get(i).getLastname());
            studentS.setGroup(students.get(i).getGroup());
            studentS.setMarks(students.get(i).getMarks());
        }
    }

    public void delLessThan3() {
        simpleS.removeIf(s -> s.getAvarageMark() < 3);
    }

    public Map<String, Integer> getStudentsMarksBySubject(Subject subject)
    {
        var resMap = new HashMap<String, Integer>();
        for (var student: simpleS)
        {
            resMap.put(student.getId(),student.getMarkBySubject(subject).getValue());
        }
        return resMap;
    }

    public String convertStudentMarksBySubject(Map<String,Integer> sub) {
        return sub.entrySet().stream().map((ent) -> {
            var student = simpleS.stream().filter(std -> std.getId() == ent.getKey()).findFirst().get();
            return (String)(student.getName() + " " + student.getLastname() + " " + ent.getValue());
              }).collect(Collectors.joining("\n"));
    }

    public void  display(){
        System.out.println(simpleS.stream().map(st -> st.toString()).collect(Collectors.joining("\n")));
    }

    public String prizvishe() {
        return simpleS.stream().map(st -> st.getLastname()).collect(Collectors.joining("-"));
    }
    public StudentSimple getBestStudent()
    {
        var arr = new ArrayList<StudentSimple>(simpleS);
        arr.sort(Comparator.comparingDouble(StudentSimple::getAvarageMark).reversed());
        return arr.get(0);
    }
    public void sortuvannia(){
        simpleS.sort(Comparator.comparing(StudentSimple::getSurname));
        simpleS.sort(Comparator.comparing(StudentSimple::getName));
        simpleS.sort(Comparator.comparing(StudentSimple::getLastname));
    }
}

