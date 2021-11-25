package Task3;

import java.util.*;
import java.util.stream.Collectors;

public class StudentSimple {

    private Set<Mark> marks;

    private String id, name, surname, lastname, group;

    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setMarks(Set<Mark> marks) {
        this.marks = marks;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + surname + " " + lastname + " " + group + " " + " \n\t" +
                marks.stream().map(m -> m.toString()).collect(Collectors.joining("\n\t"));
    }
    public double getAvarageMark() {
        return marks.stream().mapToInt(mark -> mark.getValue()).average().getAsDouble();
    }
    public Mark getMarkBySubject(Subject subject)
    {
        return marks.stream().filter(mark -> subject.equals(mark.getSubjectName())).findFirst().get();
    }
}
    

  



