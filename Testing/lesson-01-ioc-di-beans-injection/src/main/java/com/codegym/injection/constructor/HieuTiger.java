package com.codegym.injection.constructor;

public class HieuTiger {

    private int id;
    private String name;
    private int age;

    public HieuTiger() {
    }

    public HieuTiger(int id) {
        this.id = id;
    }

    public HieuTiger(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Hello World");
    }

    public HieuTiger(int id, String name) {
        this.id = id;
        this.name = name;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "HieuTiger{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
