/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd4464.assignment2.prestigeworldwide;

import java.util.ArrayList;
import java.util.List;
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
public class CourseTest {
    
    public CourseTest() {
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
    public void testEmptyCourse(){
        System.out.println("Course");
        List<Student> students = new ArrayList<Student>();
        Course instance = new Course();

        assertEquals(students, instance.getAll());
    }
    
    @Test
    public void testCourseConstructor(){
        System.out.println("Course");
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Travis", "6969", "Trans", 10));
        Course instance = new Course();
        
        assertEquals(students, instance.getAll());
    }
}
