/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.view;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import sit.model.Student;

/**
 *
 * @author INT105
 */
public class TestScanner {

    public static void main(String[] args) {
        int numOfLines = 0;
        int numOfWords = 0;
        int numOfChars = 0;
        ArrayList<Student> stdList = new ArrayList<Student>();
        try {
            File myFile = new File("StudentList.txt");
            Scanner sc = new Scanner(myFile);
            while (sc.hasNextLine()) {
                numOfLines += 1;

                String line = sc.nextLine();
                numOfChars += line.length();
                System.out.println(line);
                System.out.println("---");

                Scanner scStr = new Scanner(line);
                while (scStr.hasNext()) {
                    int id=scStr.nextInt();
                    String firstname=scStr.next();
                    String lastname=scStr.next();
                    Student std=new Student(id,firstname,lastname);
                    stdList.add(std);
                    numOfWords += 1;
                    
                    //System.out.println(scStr.next());

                }
                //System.out.println("---");
            }

        } catch (FileNotFoundException ff) {
            System.out.println(ff);

        }
        for (Student student : stdList) {
            System.out.println(student);
            
        }
        System.out.println("number Of Lines: " + numOfLines);
        System.out.println("number Of Words: " + numOfWords);
        System.out.println("num Of Chars: " + numOfChars);
//        String myMessage="Mango Grape Apple Guava";
//        int words =0;
//        Scanner input =new Scanner(myMessage);
//        while (input.hasNext()) {
//            System.out.println(input.next());
//            words+=1;
//            
//        }
//        System.out.println("Numbers of Words: "+words);
    }

}
