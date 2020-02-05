package Logik;

import Student.Student;

import java.util.Arrays;

public class Logic {

    public static Student[] findBest(Student[] students){
        Student[] result = new Student[0];
        for (Student student : students) {
            boolean flag = true;
            for (int i = 0; i <student.getMarks().length ; i++) {
                if(student.getMarks()[i] < 9){
                    flag = false;
                    break;
                }else
                    result = extendArr(result,student);
            }
        }

        return result;
    }

    private static Student[] extendArr(Student[] result, Student student){
        result = Arrays.copyOf(result,result.length + 1);
        result[result.length - 1] = student;
        return result;
    }

}
