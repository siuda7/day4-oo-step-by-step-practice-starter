package oo;

import java.util.ArrayList;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Teacher extends Person{

    private static final String JOB = "teacher";

    private ArrayList<Klass> klasses = new ArrayList<>();

    public Teacher(Integer id, String name, Integer age) {
        super(id, name, age, JOB);
    }

    public void assignTo(Klass klass) {
        klasses.add(klass);
    }

    public boolean belongsTo(Klass klass) {
        return klasses.contains(klass);
    }

    private String getKlasses() {
        return klasses.stream()
                .map(klass -> klass.getNumber().toString())
                .collect(Collectors.joining(", "));
    }

    @Override
    public String introduce() {
        return String.format("My name is %s. I am %d years old. I am a teacher. I teach Class %s.",name, age, getKlasses());
    }

    public boolean isTeaching(Student student) {
        return klasses.contains(student.getKlass());
    }

    @Override
    public void sayWhenLeaderAssigned(Integer classNumber, String leaderName) {
        String leaderMsg =  String.format("I am %s, teacher of Class %d. I know %s become Leader.", name, classNumber, leaderName);
        System.out.println(leaderMsg);
    }
}
