package com.lal.Model;

public class Item {
    private long EmpId;
    private String EmpName;
    private double Price;
    public Item(){

    }
    public Item(long id, String name, double price){
        this.EmpId=id;
        this.EmpName = name;
        this.Price = price;
    }

    public long getEmpId() {
        return EmpId;
    }
    public void setEmpId(long id){
        this.EmpId=id;
    }
    public String getEmpName(){
        return  EmpName;
    }
    public void setEmpName(String name){
        this.EmpName = name;
    }

    public double getPrice() {
        return Price;
    }
    public void setPrice(double price){
        this.Price= price;
    }
}
