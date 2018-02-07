
package javaoverflow;

import java.util.Scanner;

public class JavaOverflow {

    
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        byte max=Byte.MAX_VALUE;
        byte min=Byte.MIN_VALUE;
        System.out.print("Q1: ");
        System.out.println("Max Value: "+max);
        System.out.println("Min Valut: "+min);
        
        System.out.println("Q2: ");
        System.out.println("Max Value: "+max++);
        System.out.println("Min Valut: "+min--);
        
        
       
        
        for (byte i = 0; i <= 149; i++) {
            System.out.println(i);
            
        }
   
    }
   
        
    }

