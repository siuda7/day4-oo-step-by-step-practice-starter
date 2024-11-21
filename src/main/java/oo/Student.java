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
        if (this.klass == null) {
            return false;
        }
        return this.klass.equals(klass);
    }

    public Student(Integer id, String name, Integer age, String job) {
        super(id, name, age, job);
    }

    private String getClassStatusMsg() {
        if (klass.isLeader(this)) {
            return String.format("I am the leader of class %s.", klass.getNumber());
        }
        return String.format("I am in class %s.", klass.getNumber());
    }

    @Override
    public String introduce() {
        return String.format("My name is %s. I am %d years old. I am a %s. %s", name, age, job, getClassStatusMsg());
    }

    public Klass getKlass() {
        return klass;
    }

}
