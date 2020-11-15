package com.eplugger.entity;

public class Student {
    private Integer id;
    private String name;
    private String sex;
    private Integer age;
    private String hobby;

    public Student(Integer id, String name, String sex, Integer age, String hobby) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.hobby = hobby;
    }

    public Student(String name, String sex, Integer age, String hobby) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.hobby = hobby;
    }

    public Student() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
