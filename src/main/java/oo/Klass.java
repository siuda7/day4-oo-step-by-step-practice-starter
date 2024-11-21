package oo;

import java.util.ArrayList;
import java.util.Objects;

public class Klass {

    private static final String NOT_IN_KLASS_ERROR =  "It is not one of us.";

    private Integer number;

    private Student leader;

    private ArrayList<Person> members = new ArrayList<>();

    public Integer getNumber() {
        return number;
    }

    public Klass(Integer number) {
        this.number = number;
    }

    public void attach(Person person) {
        members.add(person);
    }

    public void assignLeader(Student student) {
        if (student.getKlass() != null && student.getKlass().equals(this)) {
            this.leader = student;
            this.members.stream()
                   .forEach(member -> {
                       if (isLeader(member)) member.sayWhenLeaderAssigned(this.number, student.getName());
                     });
        } else {
            System.out.print(NOT_IN_KLASS_ERROR);
        }
    }

    public boolean isLeader(Person student) {
        return this.leader != null && this.leader.equals(student);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Klass klass = (Klass) o;
        return Objects.equals(number, klass.number);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

}
