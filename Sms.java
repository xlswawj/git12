package com.briup.ch12;

import java.util.Scanner;
/**
  ҵ����
  ѧ����Ϣ����ϵͳ

 */
public class Sms { 
    private Student[] stus;//�洢ѧ�����������
	private int index;//��¼ѧ������������
 //���캯��
    public Sms(){
	 this.stus = new Student[3];
	 this.index = 0;
	 } 
    /**
	 ���ѧ����Ϣ
	 */
    public void save(Student stu){
	
	
	 }
   /**
     ��ѯ����ѧ����Ϣ
    */
    public Student[] findAll(){
	 //����Ŀ���
     Student[] demo = new Student[index];
	 System.arraycopy(stus,0,demo,0,index);
	  return demo;
	 }
	/**
	ͨ��ID��ѯ����ѧ����Ϣ
	 */
    public Student findById(long id){
	  return null;
	 }
	 /**
	 ͨ��IDɾ��ѧ����Ϣ
	 */
	public void deleteById(long id){
	 
	  }
     /**
	 ����ѧ����Ϣ
	  */
	public void update(Student newStu){
	  
	   }
     /**
	 �˵�
	  */
    public void menu(){
	  System.out.println("**********ѧ����Ϣ����ϵͳ**********");
	  System.out.println("*1.��ѯ����ѧ����Ϣ");
	  System.out.println("*2.¼������ѧ����Ϣ");
	  System.out.println("*3.ɾ������ѧ����Ϣ");
	  System.out.println("*4.�鿴����ѧ����Ϣ");
	  System.out.println("*5.��������ѧ����Ϣ");
	  System.out.println("*help.����");
	  System.out.println("*exit.�˳�");
	  System.out.println("**********************");

	  }

	public static void main(String[] args){
	   Sms sms = new Sms();
	   Scanner sc = new Scanner(System.in);
	   sms.menu();
	   while(true){
	   System.out.println("�����빦�ܱ�ţ�"); 
	   String option = sc.nextLine();
	   switch(option){
		   case"1":{
		   System.out.println("�����������ѧ����Ϣ��");
		   System.out.println(" �ܼ�"+sms.index+"��");
			   break; 
			   }
		   case"2":{ 
			   while(true){ 
		   System.out.println("������ѧ����Ϣ��id#name#age���������롾break���������˵�");  
		   String stuStr = sc.nextLine();//���ǽ�����Ϣ��Ӧ��nextLine
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
		   System.out.println("ByeBye����ӭ�´�ʹ�ã�");
		   //���÷�����ѯ����ѧ����Ϣ
		   Student[] arr = sms.findAll();
		   //������ӡ�����е�ѧ������
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
				System.out.println("��������");
		  }

	    }
	  

	    
	  
	 }
}