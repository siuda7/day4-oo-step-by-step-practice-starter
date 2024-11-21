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

    private String isLeaderMsg() {
        if (klass.isLeader(this)) {
            return String.format("I am the leader of class %s.", klass.getNumber());
        }
        return "";
    }

    @Override
    public String introduce() {
        return String.format("My name is %s. I am %d years old. I am a %s. I am in class %d. %s", name, age, job, klass.getNumber(), isLeaderMsg());
    }

    public Klass getKlass() {
        return klass;
    }

}
