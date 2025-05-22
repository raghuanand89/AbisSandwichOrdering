package com.abis.abissandwichordering.repository;

import com.abis.abissandwichordering.model.Instructor;
import com.abis.abissandwichordering.model.Manager;
import com.abis.abissandwichordering.model.Person;
import com.abis.abissandwichordering.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PersonRepository {
    ArrayList<Student> students = new ArrayList<>();
    ArrayList<Instructor> instructors = new ArrayList<>();
    ArrayList<Manager> managers = new ArrayList<>();

    public PersonRepository() {
        students.add(new Student("Raghunath", "SINGH", "JAVA"));
        students.add(new Student("Bart", "MICHAELS", "JAVA"));
        students.add(new Student("Noortje", "GERARD", "JAVA"));
        students.add(new Student("Alain", "VITRY", "JAVA"));
        students.add(new Student("Frederik", "JACOBS", "C++"));
        students.add(new Student("Patrick", "GARAIN", "C++"));

        instructors.add(new Instructor("David", "DEROUBAIX", "JAVA"));
        instructors.add(new Instructor("Koen", "DEWEER", "C++"));

        managers.add(new Manager("Leen", "SMITH", "l-smith@gmail.com"));
        //System.out.println(students);


    }

    public Student getStudentByName(String fname, String lname) {

        return (students.stream().filter(s1 -> s1.getFirstName().equalsIgnoreCase(fname) && s1.getLastName().equalsIgnoreCase(lname))
                .findFirst().orElseThrow(() -> new RuntimeException("Person not found!")));

    }

    public List<Student> getStudentsByCourse(String course) {
        return(students.stream().filter(s1->s1.getCourseName().equalsIgnoreCase(course))
        .collect(Collectors.toList()));
    }

    public List<Instructor> getInstructorsByCourse(String course) {
        return(instructors.stream().filter(i1->i1.getCourseName().equalsIgnoreCase(course))
                .collect(Collectors.toList()));
    }

    @Override
    public String toString() {
        return "PersonRepository{" +
                "students=" + students +
                ", instructors=" + instructors +
                ", managers=" + managers +
                '}';
    }
}
