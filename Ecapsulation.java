/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.firstpro;

/**
 *
 * @author Calvin
 */

class StaffPersonalDetails
{
    private String address;
    private double phoneno;
    private String gender;
           
    public String geteaddress()
    {
        return address;
    }
    public double getphoneno()
    {
        return phoneno;
    }
    public String getgender()
    {
        return gender;
    }
    public void setaddress(String a)
    {
        address=a;
        
    }
    public void setphoneno(int b)
    {
        phoneno=b;
         }
    public void setgender(String c)
    {
        gender=c;
        
    }
}
class Employee
{
    private int empno;
    private String name;
    private double salary;
   
    
    public int getempno()
    {
        return empno;
    }
    public String getname()
    {
        return name;
    }
    public double getsalary()
    {
        return salary;
    }
    public void setempno(int a)
    {
        empno=a;
        
    }
    public void setname(String b)
    {
        name=b;
    }
    public void setsalary(double c)
    {
        
        salary=c;
    }
}


public class Ecapsulation {
    public static void main (String args[])
    {
        StaffPersonalDetails info= new StaffPersonalDetails();
        Employee empl= new Employee();
        empl.setempno(52145);
        empl.setname("John");
        empl.setsalary(100000);
        info.setaddress(" decarie, quebec canada");
        info.setgender("male");
        info.setphoneno(51492251);
        
        System.out.println("Employee No: "+empl.getempno()+"\tEmployee Name: "+empl.getname()
                +"\tEmployee salary: "+empl.getsalary() + "\tEmployee address: "+info.geteaddress()
        +"\tEmployee phoneno: "+info.getphoneno()+"\tEmployee gender: "+info.getgender());
        Employee emp2 = new Employee();
        emp2.setempno(65214);
        emp2.setname("Linda");
        emp2.setsalary(250000);
        info.setaddress("dorval");
        info.setphoneno(5457878);
        info.setgender("female");
        System.out.println("Employee No: "+emp2.getempno()+"\tEmployee Name: "
                +emp2.getname()+"\tEmployee Salary: "+emp2.getsalary()
        + "\tEmployee address: "+info.geteaddress()
        +"\tEmployee phoneno: "+info.getphoneno()+"\tEmployee gender: "+info.getgender());
        
    }
}
