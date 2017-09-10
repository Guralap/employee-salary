/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Scanner;

/**
 *
 * @author 1691677
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        Scanner input=new Scanner(System.in);
        String name;
       double phone;
       double net_salary;
       System.out.print("Enter the name of employee:");
       name = input.next( );
       System.out.println("enter the phone number");
        phone=input.nextDouble();
        double salaryPh; //salary perhour
        double hours;
        double salary;
       System.out.println("Enter salary per hour:");
       salaryPh=input.nextDouble();
       System.out.println("Enter hours worked");
       hours=input.nextDouble();
      
       if (hours>=40){
           salary=salaryPh*hours+100;
       }
       else if (hours >=50){
           salary=salaryPh*hours+200;
       }
       else 
        salary=salaryPh*hours;
      
       
       double GST;
       double QST;
       GST=salary*15/100;
       QST=salary*13/100;
       net_salary=salary-(GST+QST);
       System.out.print("The net salary of "+name+" is "+net_salary);
       
               
       
        
    }
    
}
