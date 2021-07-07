package edu.miu.cs.cs425.webapps.eregistrar.service;

import edu.miu.cs.cs425.webapps.eregistrar.model.Student;

import java.util.*;

public interface StudentService {
    public abstract List<Student> getStudents();
    public abstract Student saveStudent(Student student);
    public abstract Student getStudentById(Long studentId);
    public abstract void deleteStudentById(Long studentId);
}