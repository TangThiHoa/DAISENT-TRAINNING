package com.java.daicent.collection.main;

import com.java.daicent.collection.model.*;

import java.util.*;

public class StudentTest {


    public static void main(String[] args) {
        School school0 = new School(1, "Daicent");


        Subject subject0 = new Subject(1, "Math");
        Subject subject1 = new Subject(3, "English");
        Subject subject2 = new Subject(5, "History");
        Subject subject3 = new Subject(7, "Japanese");

        Clazz clazz0 = new Clazz(1, "2B");
        Clazz clazz1 = new Clazz(2, "2A");
        Clazz clazz2 = new Clazz(3, "3A");
        Clazz clazz3 = new Clazz(4, "2C");

        Grade grade = new Grade(1, "1");
        Grade grade1 = new Grade(2, "2");
        Grade grade2 = new Grade(3, "3");
        Grade grade3 = new Grade(4, "4");
        Grade grade4 = new Grade(5, "5");

        Student student = new Student(1, "Hoa", 9, 7.9);
        Student student2 = new Student(3, "Hoang", 8, 9);
        Student student3 = new Student(8, "Huy", 7, 6.9);
        Student student4 = new Student(9, "Hung", 7, 8.9);
        Student student5 = new Student(11, "Huong", 7, 6);

        List<Student> students = new ArrayList<Student>();
        students.add(student);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student5);


        //Sắp xếp điểm từ cao xuống

        Collections.sort(students, new Comparator<Student>() {  // anominus class
            @Override
            public int compare(Student o1, Student o2) {
                if (o1.getCoreAvgStudent() < o2.getCoreAvgStudent()) {
                    return 1;
                } else if (o1.getCoreAvgStudent() > o2.getCoreAvgStudent()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        });
        System.out.println("Danh sách học sinh trong trường sắp xếp theo điểm:");
        for (Student s : students) {
            System.out.println(s.toString());

        }
        System.out.println("");
        System.out.println(" Học sinh có điểm cao nhất trường: ");
        System.out.println(students.get(0));
        System.out.println("");

        Map<Clazz, List<Student>> clazzListMap = new HashMap<>();
        List<Student> studentList = Arrays.asList(student3, student4);
        System.out.println("Danh sách các học sinh trong lớp " + clazz1 + ":");
        for (Student s : studentList) {
            System.out.println(s.toString());

        }
        clazzListMap.put(clazz1, studentList);
        System.out.println("");
        Collections.sort(studentList, (o1, o2) -> {
            if (o1.getCoreAvgStudent() < o2.getCoreAvgStudent()) {
                return 1;
            } else if (o1.getCoreAvgStudent() > o2.getCoreAvgStudent()) {
                return -1;
            } else {
                return 0;
            }
        });
        System.out.println("Sắp xếp điểm tăng dần trong lớp:");
        for (Student s: studentList) {
            System.out.println(s.getNameStudent() + s.getCoreAvgStudent());

        }
        System.out.println("");
        System.out.println( "Học sinh có điểm cao nhất lớp: ");
        System.out.println(studentList.get(0));
        System.out.println("");


        Map<Grade, List<Clazz>> gradeListMap = new HashMap<>();
        List<Clazz> clazzList = Arrays.asList(clazz0, clazz1,clazz3);
        System.out.println("Danh sách các lớp trong khối " + grade1 +":");
        for (Clazz c : clazzList) {
            System.out.println(c.toString());
        }
        gradeListMap.put(grade1, clazzList);
        System.out.println("");


        Map<School,List<Student>> schoolListMap = new HashMap<>();
        List<Student> studentList1 = Arrays.asList(student,student2,student3,student4,student5);
        System.out.println("Danh sách các học sinh trong trường " + school0 + ":");
        for (Student s1 :studentList1) {
            System.out.println(s1.toString());
        }
        schoolListMap.put(school0,studentList1);
        System.out.println("");

        double sumClazz=0;
        double avgClazz=0;
        for (Map.Entry<School,List<Student>> entry : schoolListMap.entrySet()) {
            for (Student s: entry.getValue()) {
                sumClazz += s.getCoreAvgStudent();
                avgClazz = sumClazz/entry.getValue().size();

            }
            System.out.println("Điểm trung bình học sinh trong trường: " + avgClazz);
            System.out.println("");

        }


        Map<Grade,List<Student>> gradeListMap1 = new HashMap<>();
        List<Student> studentList2 = Arrays.asList(student3,student4,student5);
        System.out.println("Danh sách các học sinh trong khối " + grade1 + ":");
        for (Student s2 :studentList2) {
            System.out.println(s2.toString());
        }
        gradeListMap1.put(grade1,studentList2);
        System.out.println("");

        double sumGrade=0;
        double avgGrade=0;
        for (Map.Entry<Grade,List<Student>> entry : gradeListMap1.entrySet()) {
            for (Student s: entry.getValue()) {
                sumGrade += s.getCoreAvgStudent();
                avgGrade = sumGrade/entry.getValue().size();

            }
            System.out.println("Điểm trung bình học sinh trong khối: " + avgGrade);

        }




    }
}
