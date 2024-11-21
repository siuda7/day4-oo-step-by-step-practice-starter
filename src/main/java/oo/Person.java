package oo;

import java.util.Objects;

public class Person {

    protected Integer id;

    protected String name;

    protected Integer age;

    protected String job;

    public Person(Integer id, String name, Integer age, String job) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.job = job;
    }

    public Person(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        return String.format("My name is %s. I am %d years old. I am a %s.", name, age, job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object anotherPerson) {
        if (anotherPerson == null) {
            return false;
        }
        if (anotherPerson instanceof Person) {
            return this.id.equals(((Person) anotherPerson).id);
        } else {
            return false;
        }

    }

}
