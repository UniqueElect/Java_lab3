package Task3;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Student
{
    private Set<Mark> marks;

    private String id,name, surname, lastname,group;

    public Student(String id, String name, String surname, String lastname, String group, Set<Mark> marks)
    {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.lastname = lastname;
        this.group = group;
        this.marks = marks;
    }

    public Student(String id, String name, String surname, String lastname,String group)
    {
        this (id, name, surname, lastname, group ,new HashSet<Mark>());
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGroup() { return group; }

    public String getId() {
        return id;
    }

    public Set<Mark> getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + surname + " " + lastname + " " + group + "\n\t" +
                marks.stream().map(m -> m.toString()).collect(Collectors.joining("\n\t"));
    }
    public void addMark(Mark mark)
    {
        marks.add(mark);
    }
    public double getAvarageMark()
    {
        return marks.stream().mapToInt(mark -> mark.getValue()).average().getAsDouble();
    }
    public Mark getMarkBySubject(Subject subject)
    {
        return marks.stream().filter(mark -> subject.equals(mark.getSubjectName())).findFirst().get();
    }
}