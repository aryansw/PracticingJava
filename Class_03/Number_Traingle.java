/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class_03;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Number_Traingle {
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a;
       
        for(int i=1;i<=10;i++)
        {
           for(int j=1;j<=i;j++)
           {
               System.out.print(j);
           }
           System.out.println(" ");
        }
    }
}
