package oo;

import java.util.Objects;

public class Klass {

    private static final String NOT_IN_KLASS_ERROR =  "It is not one of us.";

    private Integer number;

    private Student leader;

    public Integer getNumber() {
        return number;
    }

    public Klass(Integer number) {
        this.number = number;
    }

    public void assignLeader(Student student) {
        if (student.getKlass() != null && student.getKlass().equals(this)) {
            this.leader = student;
        } else {
            System.out.print(NOT_IN_KLASS_ERROR);
        }
    }

    public boolean isLeader(Student student) {
        return leader != null && leader.equals(student);
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
