package com.spring.sample;

public class Employee2 {  
private int id;  
private String name;  
  
public Employee2() {System.out.println("def cons");}  
  
public Employee2(int id) {this.id = id;}  
  
public Employee2(String name) {  this.name = name;}  
  
public Employee2(int id, String name) {  
    this.id = id;  
    this.name = name;  
}  
  
void show(){  
    System.out.println(id+" "+name);  
}  
  
} 
