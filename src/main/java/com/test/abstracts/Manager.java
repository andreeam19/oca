package com.test.abstracts;

public class Manager extends Employee{
    Headquourters hq;
    boolean isDisabled;


    Manager(String name,int id, int salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }

    public String toString(){
        return "name: "+name+", id: "+id+",salary: "+salary;
    }

    @Override
    public boolean isDisabled() {
        return false;
    }

    public void setDisabled(boolean disabled) {
        isDisabled = disabled;
    }
    public boolean getDisabled(){
        return isDisabled;
    }
}
