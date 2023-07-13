package com.driver;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentRepository {

    Map<String , Student> studentMap = new HashMap<>();
    Map<String , Teacher> teacherMap = new HashMap<>();

    Map<String , List<String>> teacherStudentMap = new HashMap<>();
    public void addStudent(Student student) {
        studentMap.put(student.getName() , student);
    }

    public void addTeacher(Teacher teacher) {
        teacherMap.put(teacher.getName() , teacher);
    }

    public void addStudentTeacherPair(String student, String teacher) {
        List<String> curr = teacherStudentMap.get(teacher);
        curr.add(student);
        teacherStudentMap.put(teacher , curr);
    }
}
