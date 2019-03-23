package com.demo.spring;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.immutable.pojo.Student;
import org.immutable.pojo.Subject;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Subject s1 = new Subject("Maths", 100);
        Subject s2 = new Subject("English", 81);
        Subject s3 = new Subject("Science", 79);
        List<Subject> l = new LinkedList();
        l.add(s1);
        l.add(s2);
        l.add(s3);
        Student s = new Student("Abrar", 22, new Date("1993/01/22"), l);
        Subject s4 = new Subject("History", 50);
        System.out.println("s1111"+s.getMarks());
        System.out.println("size before adding subject :: "+s.getMarks().size());
        System.out.println("adding s4 :: "+s4);
        s.getMarks().add(s4); 
        System.out.println("size after adding subject :: "+s.getMarks().size());
        
        // Changing date field 
        System.out.println("date of birth before change ::"+s.getDob());
        s.getDob().setDate(12);
        System.out.println("date of after before change ::"+s.getDob());
        
        System.out.println(s);
    }
}
