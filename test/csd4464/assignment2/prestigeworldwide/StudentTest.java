/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd4464.assignment2.prestigeworldwide;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author c0659824
 */
public class StudentTest {
    
    public StudentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testGetName(){
        System.out.println("getName");
        Student instance = new StudentImpl();
        String expResult = "Travis Kelly";
        instance.setName(expResult);
        String result = instance.getName();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetID(){
        System.out.println("getId");
        Student instance = new StudentImpl();
        String expResult = "696969";
        instance.setId(expResult);
        String result = instance.getId();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetGender(){
        System.out.println("getGender");
        Student instance = new StudentImpl();
        String expResult = "Trans";
        instance.setGender(expResult);
        String result = instance.getGender();
        assertEquals(expResult, result);
    }
    
    @Test
    public void testGetGrade(){
        System.out.println("getGrade");
        Student instance = new StudentImpl();
        double expResult = 10;
        instance.setGrade(expResult);
        double result = instance.getGrade();
        assertEquals(expResult, result, 0.0);
    }
    
    @Test
    public void testConstructorShouldReturnValues(){
        System.out.println("Student");
        
        String name = "Travis";
        String id = "12345";
        String gender = "Trans";
        double grade = 10;
        Student instance = new Student(name, id, gender, grade);
        
        assertEquals(name, instance.getName());
        assertEquals(id, instance.getId());
        assertEquals(gender, instance.getGender());
        assertEquals(grade, instance.getGrade(), 0.0);
    }
    
    @Test
    public void testEmptyConstructor(){
        System.out.println("Student");

        Student instance = new Student();

        assertEquals("", instance.getName());
        assertEquals("", instance.getId());
        assertEquals("", instance.getGender());
        assertEquals(0, instance.getGrade(), 0.0);
    }
    
    @Test
    public void testEquals() {
        System.out.println("equals");
        Student instance = new StudentImpl();
        instance.setName("Travis Kelly");
        instance.setId("696969");
        instance.setGender("Trans");
        instance.setGrade(10);
        Student instance2 = new StudentImpl();
        instance2.setName("Travis Kelly");
        instance2.setId("696969");
        instance2.setGender("Trans");
        instance2.setGrade(10);
        assertEquals(instance, instance2);
    }
    
    public class StudentImpl extends Student{
    }
}
