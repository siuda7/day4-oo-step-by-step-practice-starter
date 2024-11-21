package oo;

import java.util.Objects;

public class Person {

    private Integer id;

    private String name;

    private Integer age;

    public Person(Integer id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String introduce() {
        return String.format("My name is %s. I am %d years old.", name, age);
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
