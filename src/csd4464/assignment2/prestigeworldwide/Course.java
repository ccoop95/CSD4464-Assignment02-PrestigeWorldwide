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
    
    public void Course(){
        getAll();
    }
    
    public void Course(List<Student> Course) {
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
       
    public void get(String id){
       // students.indexOf();
    }
    
    
    
    public void getAllByGender(String gender){
        //HashSet<Student> students = new HashSet<>();
        
    }
    
    @Override
    public String toString() {
        for (string )
        return "Student{" + "name=" + name + ", id=" + id + ", gender=" + gender + ", grade=" + grade + '}';
    }
}
