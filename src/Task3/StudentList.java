package Task3;

import java.util.*;
import java.util.stream.Collectors;

public class StudentList
{
    private Set<Subject> subjects;
    private Map<String, Student> students;

    public StudentList(Set<Subject> subjects, Student[] students)
    {
        this.subjects = subjects;
        this.students = new HashMap<String, Student>();
        for (var student : students)
            this.students.put(student.getId(), student);
    }

    public void addSubject(Subject subject)
    {
        subjects.add(subject);
    }

    public void addSubjectWithMarks(Subject subject, Map<String, Integer> marks)
    {
        addSubject(subject);
        for (var mark : marks.entrySet())
            students.get(mark.getKey()).addMark(new Mark(mark.getValue(), subject));
    }

    public Student getStudentById(String id)
    {
        return students.get(id);
    }

    @Override
    public String toString() {
        return students.values().stream().map(st -> st.toString()).collect(Collectors.joining("\n"));
    }

    public Student getBestStudent()
    {
        var arr = new ArrayList<Student>(students.values());
        arr.sort(Comparator.comparingDouble(Student::getAvarageMark).reversed());
        return arr.get(0);
    }

    public Map<String, Integer> getStudentsMarksBySubject(Subject subject)
    {
        var resMap = new HashMap<String, Integer>();
        for (var student: students.entrySet())
            resMap.put(student.getKey(), student.getValue().getMarkBySubject(subject).getValue());
        return resMap;
    }
}