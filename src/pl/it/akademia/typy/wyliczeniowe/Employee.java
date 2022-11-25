package pl.it.akademia.typy.wyliczeniowe;

public class Employee {
    private int id;
    private String name;
    private String surname;
    private int salary;
    private Posiotion position;

    public Employee(int id, String name, String surname,
                    int salary, Posiotion position) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.position = position;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Posiotion getPosition() {
        return position;
    }

    public void setPosition(Posiotion position) {
        this.position = position;
    }

    public enum Posiotion {
        LOW,
        MID,
        HIGH
    }

    static class A {

    }
}
