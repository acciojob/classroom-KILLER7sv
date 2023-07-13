package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public void addStudent(Student student) {
        studentRepository.addStudent(student);
    }

    public void addTeacher(Teacher teacher) {
        studentRepository.addTeacher(teacher);
    }

    public void addStudentTeacheraPair(String student, String teacher) {
        studentRepository.addStudentTeacherPair(student , teacher);
    }

    public Student getStudentByName(String name) {
        return studentRepository.studentMap.get(name);
    }

    public Teacher getTeacherByName(String name) {
        return studentRepository.teacherMap.get(name);
    }

    public List<String> getStudentsByTeacherName(String teacher) {
        return studentRepository.teacherStudentMap.get(teacher);
    }

    public List<String> getAllStudents() {
        List<String> students = new ArrayList<>();
        for(String student : studentRepository.studentMap.keySet()){
            students.add(student);
        }
        return students;
    }

    public void deleteTeacherByName(String teacher) {
        studentRepository.teacherMap.remove(teacher);
//        studentRepository.teacherStudentMap.remove(teacher);
    }

    public void deleteAllTeachers() {
        studentRepository.teacherMap = new HashMap<>();
    }
}
