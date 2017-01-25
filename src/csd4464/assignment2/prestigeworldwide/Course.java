/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd4464.assignment2.prestigeworldwide;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author c0659824
 */
public class Course extends Student{
    List<Student> students = new ArrayList<>();
    public List<Student> Course;
    
    public Course(){
        
    }
    
    public Course(List<Student> Course) {
            this.Course = Course;
    }
    
    public List<Student> getAll(){
        return students;
    }
    
    public void add(Student stu){
        students.add(stu);
    }
    
    public void remove(Student stu){
        students.remove(stu);
    }
    
    public void remove(String id){
        students.remove(id);
    }
    
    public void remove(int position){
        students.remove(position);
    }
       
    public List<Student> get(String id){
       // students.indexOf();
       return null;
    }
    
    
    
    public HashSet<Student> getAllByGender(String gender){
        HashSet<Student> stuset = new HashSet<>();
        stuset.addAll(students);
        return stuset;
    }
    
    @Override
    public String toString() {
        String returnString = "Course {";
        for (int i = 0; i < students.size(); i++ ){
          returnString += students.toString();
        }
        returnString += "}";
         return returnString;
    }
}
