package com.Jarson.Map;

/**
 * @author Jarson
 * @create 2019-05-18 21:21
 */
/*
    实体类
    Comparable接口
        专门处理数组中的排序
 */
public class Employee implements Comparable<Employee>{
    private int id ;
    private String eName ;
    private double salary ;

    public Employee(int id, String eName, double salary) {
        this.id = id;
        this.eName = eName;
        this.salary = salary;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "id:"+this.id+",name:"+this.eName+",salary:"+this.salary+"\n";
    }

    @Override
    public int compareTo(Employee o) {  //添加为实现的方法
            //设定规则
        if(this.id>o.id){
            return 1;

        }else if(this.id<o.id){
            return -1;
        }else{
            if(this.salary>o.salary){
                return 1;
            }else if(this.salary<o.salary){
                return -1;
            }else{
                return 0;
            }
        }
    }
}
