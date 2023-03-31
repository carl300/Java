/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trebas;

/**
 *
 * @author  calvin
 */

import java.util.*;
public class Assignment1 
        
{    

   int num_deposited;
   int num_littered;
   int percentage_female;
   int percentage_male;
   
public void deposit()
{
   float deposited_female=(percentage_female*num_deposited)/100;
   float deposited_male=(percentage_male*num_deposited)/100;
   System.out.println("The number of female that deposited: " + deposited_female);
   System.out.println("The number of male that deposited: " + deposited_male);
}

public void littered()
{
   float littered_female=(percentage_female*num_littered)/100;
   float littered_male=(percentage_male*num_littered)/100;
   System.out.println("The number of female that littered: " + littered_female);
   System.out.println("The number of male that littered: " + littered_male);
}

public static void main(String arg[])
{  
   Person myobj=new Person();
   Scanner myscan=new Scanner(System.in);
   System.out.println("Enter number of people that deposited garbage: ");
   myobj.num_deposited=myscan.nextInt();
   System.out.println("Enter number of people that littered: ");
   myobj.num_littered=myscan.nextInt();
   System.out.println("Enter percentage of female: ");
   myobj.percentage_female=myscan.nextInt();
   System.out.println("Enter percentage of male: ");
   myobj.percentage_male=myscan.nextInt(); 
   System.out.println("Analysis from the information:");
   myobj.deposit();
   myobj.littered();
   
}
 }

