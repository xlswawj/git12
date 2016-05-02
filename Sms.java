package com.briup.ch12;

import java.util.Scanner;
/**
  业务类
  学生信息管理系统

 */
public class Sms { 
    private Student[] stus;//存储学生对象的数组
	private int index;//记录学生个数的数组
 //构造函数
    public Sms(){
	 this.stus = new Student[3];
	 this.index = 0;
	 } 
    /**
	 添加学生信息
	 */
    public void save(Student stu){
	
	
	 }
   /**
     查询所有学生信息
    */
    public Student[] findAll(){
	 //数组的拷贝
     Student[] demo = new Student[index];
	 System.arraycopy(stus,0,demo,0,index);
	  return demo;
	 }
	/**
	通过ID查询所有学生信息
	 */
    public Student findById(long id){
	  return null;
	 }
	 /**
	 通过ID删除学生信息
	 */
	public void deleteById(long id){
	 
	  }
     /**
	 更新学生信息
	  */
	public void update(Student newStu){
	  
	   }
     /**
	 菜单
	  */
    public void menu(){
	  System.out.println("**********学生信息管理系统**********");
	  System.out.println("*1.查询所有学生信息");
	  System.out.println("*2.录入所有学生信息");
	  System.out.println("*3.删除所有学生信息");
	  System.out.println("*4.查看所有学生信息");
	  System.out.println("*5.更改所有学生信息");
	  System.out.println("*help.帮助");
	  System.out.println("*exit.退出");
	  System.out.println("**********************");

	  }

	public static void main(String[] args){
	   Sms sms = new Sms();
	   Scanner sc = new Scanner(System.in);
	   sms.menu();
	   while(true){
	   System.out.println("请输入功能编号："); 
	   String option = sc.nextLine();
	   switch(option){
		   case"1":{
		   System.out.println("以下输入的是学生信息：");
		   System.out.println(" 总计"+sms.index+"人");
			   break; 
			   }
		   case"2":{ 
			   while(true){ 
		   System.out.println("请输入学生信息【id#name#age】或者输入【break】返回主菜单");  
		   String stuStr = sc.nextLine();//凡是接收信息都应用nextLine
           System.out.println(stuStr); 
		    if(stuStr.equals("break")){
				break;
			    }
			   }
			   break;  }
		   case"3":{        break;  }
		   case"4":{        break;  }
		   case"5":{        break;  }
		   case"exit":{  
		   System.out.println("ByeBye！欢迎下次使用！");
		   //调用方法查询所有学生信息
		   Student[] arr = sms.findAll();
		   //遍历打印数组中的学生对象
		   for(Student stu : arr){
		   System.out.println(stu);
		       } 
		   System.exit(0);
		       }
		   case"help":{  
			   sms.menu();     
			   break; 
			   }
            default:
				System.out.println("输入有误！");
		  }

	    }
	  

	    
	  
	 }
}