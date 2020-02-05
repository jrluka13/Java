package Controller;

import Logik.Logic;
import Outer.Outer;
import Student.Student;

public class Controller {

    public void control(){

        int[] marks1 = {10,9,9,9,10};
        int[] marks2 = {10,8,9,9,10};
        int[] marks3 = {10,9,9,8,10};

        Student student1 = new Student("Petya", "Ivanov", "1172045", marks1);
        Student student2 = new Student("Vasya", "Pupkin", "1172145", marks2);
        Student student3 = new Student("Kirill", "Hex", "1172045", marks3);
        Student[] students = {student1,student2,student3};

        Outer.Show(Logic.findBest(students));

    }
}
