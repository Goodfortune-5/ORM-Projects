package com.jsp.Main;
 
import java.util.*;
 
 
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
 
import com.jsp.Entity.Student;
import com.jsp.dao.StudentDao;
 
 
 
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Application Execution Started!!!" );
        ApplicationContext con = new ClassPathXmlApplicationContext("ormconfig.xml");
        StudentDao bean = con.getBean("studentDao", StudentDao.class);
        System.out.println("=====================================");
//        Student student = new Student();
//        student.setStudentUsn(107);
//        student.setStudentName("James");
//        student.setStudentCity("Edinburgh");
//        
//        bean.insertStudent(student);
////        Student s=bean.getStudent(103);
////        System.out.println(s);
//        List<Student> allStudent = bean.getAllStudent();
//        for(Student b:allStudent) {
//        	System.out.println(b);
//        }
//        System.out.println(allStudent);
        bean.delete(107);
        System.out.println( "Application Execution Ended!!!" );
    }
}