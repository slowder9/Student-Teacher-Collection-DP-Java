package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.*;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        List<Student> studentCollection = new ArrayList<>();

        studentCollection.add(new Student("Savannah", "Lowder", 1, 1));
        studentCollection.add(new Student("Julius", "Peppers", 2, 1));
        studentCollection.add(new Student("Cam", "Newton", 3, 1));
        studentCollection.add(new Student("Luke", "Keuchly", 4, 1));
        studentCollection.add(new Student("Greg", "Olsen", 5, 1));
        studentCollection.add(new Student("Jonathan", "Stewart", 6, 1));
        studentCollection.add(new Student("Christian", "McCaffery", 7, 1));
        studentCollection.add(new Student("Kelvin", "Benjamin", 8, 1));
        studentCollection.add(new Student("Jameis", "Winston", 9, 1));
        studentCollection.add(new Student("Mike", "Evans", 10, 1));
        studentCollection.add(new Student("Erin", "Shaffer", 11, 1));
        studentCollection.add(new Student("Michael", "Robbins", 12, 1));
        studentCollection.add(new Student("Harrison", "Kepley", 13, 1));
        studentCollection.add(new Student("Becca", "Russo", 14, 1));
        studentCollection.add(new Student("Trey", "Wegmann", 15, 1));


        List<Teacher> teacherCollection = new ArrayList<>();

        teacherCollection.add(new Teacher("Patrick", "Lowder",123, 1));
        teacherCollection.add(new Teacher("Stephanie", "Snipes", 345, 1));
        teacherCollection.add(new Teacher("Dewey", "Lowder", 567, 1));

        Map<Teacher, Set<Student>>classroom = new HashMap();

        classroom.put(teacherCollection.get(0), new HashSet<>());
        classroom.get(teacherCollection.get(0)).add(studentCollection.get(0));
        classroom.get(teacherCollection.get(0)).add(studentCollection.get(1));
        classroom.get(teacherCollection.get(0)).add(studentCollection.get(2));
        classroom.get(teacherCollection.get(0)).add(studentCollection.get(3));
        classroom.get(teacherCollection.get(0)).add(studentCollection.get(4));

        classroom.put(teacherCollection.get(1), new HashSet<>());
        classroom.get(teacherCollection.get(1)).add(studentCollection.get(5));
        classroom.get(teacherCollection.get(1)).add(studentCollection.get(6));
        classroom.get(teacherCollection.get(1)).add(studentCollection.get(7));
        classroom.get(teacherCollection.get(1)).add(studentCollection.get(8));
        classroom.get(teacherCollection.get(1)).add(studentCollection.get(9));

        classroom.put(teacherCollection.get(2), new HashSet<>());
        classroom.get(teacherCollection.get(2)).add(studentCollection.get(10));
        classroom.get(teacherCollection.get(2)).add(studentCollection.get(11));
        classroom.get(teacherCollection.get(2)).add(studentCollection.get(12));
        classroom.get(teacherCollection.get(2)).add(studentCollection.get(13));
        classroom.get(teacherCollection.get(2)).add(studentCollection.get(14));

        for(Teacher key : classroom.keySet()) {
            System.out.println(key + " " + classroom.get(key));
        }

        for(Set value : classroom.values()) {
//            for (Object stud : value) { //this prints out each individual student
//                System.out.println(stud);
//            }
            System.out.println(value + " " + classroom.get(value));
        }

        //*********EXTRA******//
        for (Map.Entry<Teacher, Set<Student>> entry : classroom.entrySet()) {
            Teacher key = entry.getKey();
            Set value = entry.getValue();
            System.out.println("key, " + key + " value " + value);
        }

//        Set<Student> studentSet = new HashSet<>();
//        studentSet.add();


//        public void addStudent(String a, String b, int c, int d) {
//            Student newStudent = new Student("Savannah", "Lowder", 1, 1);
//            studentCollection.add(newStudent);

    }
}
