/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csd4464.assignment2.prestigeworldwide;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author c0659824
 */
public class Course extends Student{
    List<Student> students = new ArrayList<>();
    
    public List<Student> getAll(){
        return students;
    }
    
    
    
    
}
