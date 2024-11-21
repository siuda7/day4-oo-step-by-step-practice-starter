package oo;

public class Student extends Person{

    private static final String JOB = "student";

    public Student(Integer id, String name, Integer age) {
        super(id, name, age, JOB);
    }

}
