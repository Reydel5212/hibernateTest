package org.hibernateApp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class person {
    @Id
    @Column(name = "id")
    private int id;
    @Column(name="name")
    private String name;
    @Column(name="age")
    private int age;
    @Column(name="address")
    private String address;
    @Column(name="tel")
    private int tel;

    public person() {}

    public person(int id, String name, int age, String address,int tel){
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.tel = tel;
    }

    //gets and sets
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }
    public void setTel(int tel){ this.tel = tel; }
    public int getTel(){return tel;}
}
