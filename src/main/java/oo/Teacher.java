package oo;

public class Teacher extends Person{

    private static final String JOB = "teacher";

    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age, JOB);
    }
}
