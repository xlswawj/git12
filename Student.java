package com.briup.ch12;
/**
  学生类
 */
public class Student
{
	//1.私有属性
	private long id;
	private String name;
	private int age;
   //2.构造函数
  public Student(){
 
  }
  public Student(long id,String name,int age){
    this.id = id;
	this.name = name;
    this.age = age;
  }
  //3.提供setter,getter方法
  public void setId(long id){
    this.id = id;
  }
  public long getId(){
    return this.id;
   }
  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return this.name;
   }
  
  public void setAge(int age){
    this.age = age;
  }
  public int getAge(){
    return this.age;
   }
  //4.重写toString
  public String toString(){
    return "Student{id:"+this.id+",name:"+this.name+",age:"+this.age+"]";
   }
}
		    