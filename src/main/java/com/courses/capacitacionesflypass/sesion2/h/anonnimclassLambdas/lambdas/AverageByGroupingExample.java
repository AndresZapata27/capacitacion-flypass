package com.courses.capacitacionesflypass.sesion2.h.anonnimclassLambdas.lambdas;

import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Getter
class Student2 {
    private String name;
    private int gradeLevel;
    private double score;

    public Student2(String name, int gradeLevel, double score) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.score = score;
    }


    @Override
    public String toString() {
        return "Student{name='" + name + "', gradeLevel=" + gradeLevel + ", score=" + score + '}';
    }
}

public class AverageByGroupingExample {

    public static void main(String[] args) {
        List<Student2> students = Arrays.asList(
                new Student2("Alice", 9, 85.0),
                new Student2("Bob", 10, 78.0),
                new Student2("Charlie", 9, 92.0),
                new Student2("David", 10, 88.0),
                new Student2("Eve", 11, 95.0),
                new Student2("Frank", 11, 80.0)
        );

        // Agrupar estudiantes por nivel de grado y calcular el promedio de sus calificaciones
        Map<Integer, Double> averageScoresByGrade = students.stream()
                .collect(Collectors.groupingBy(
                        Student2::getGradeLevel,
                        Collectors.averagingDouble(Student2::getScore)
                ));

        averageScoresByGrade.forEach((grade, avgScore) -> 
                System.out.println("Grade: " + grade + ", Average Score: " + avgScore));
    }
}
