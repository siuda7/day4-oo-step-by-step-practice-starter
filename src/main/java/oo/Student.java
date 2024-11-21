package oo;

public class Student extends Person{

    private static final String JOB = "student";

    private Klass klass;

    public Student(Integer id, String name, Integer age) {
        super(id, name, age, JOB);
    }

    public void join(Klass klass) {
        this.klass = klass;
    }

    public boolean isIn(Klass klass) {
        return this.klass.equals(klass);
    }

    public Student(Integer id, String name, Integer age, String job) {
        super(id, name, age, job);
    }

    @Override
    public String introduce() {
        return String.format("My name is %s. I am %d years old. I am a %s. I am in class %d", name, age, job, klass.getNumber());
    }

}
