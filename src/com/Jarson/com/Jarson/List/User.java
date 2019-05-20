package com.Jarson.com.Jarson.List;

/**
 * @author Jarson
 * @create 2019-05-20 13:10
 */
/*
    实体类

 */
public class User {
        private int id ;
        private String uName ;
        private double salary ;

    public User() {
    }

    public User(int id, String uName, double salary) {
        this.id = id;
        this.uName = uName;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", uName='" + uName + '\'' +
                ", salary=" + salary +
                '}';
    }
}
