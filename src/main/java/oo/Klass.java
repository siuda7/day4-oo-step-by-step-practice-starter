package oo;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

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
            String asssignLeaderMsg = this.members.stream()
                   .map(member -> member.sayWhenLeaderAssigned(this.number, student.getName()))
                   .collect(Collectors.joining(" "));
            System.out.print(asssignLeaderMsg);
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

    public void allMemberIntroduce() {
        members.stream()
                .map(Person::introduce)
                .collect(Collectors.joining(" "));
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }

}
