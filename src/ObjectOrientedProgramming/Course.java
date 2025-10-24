package ObjectOrientedProgramming;

import Array.NoOfOccurrences;

public class Course {
    static int maxCapacity = 100;
    String courseName;
    int enrolledStudents;
    int enrolled = 0;

    Course(String courseName, int enrolledStudents){
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    String[] enrollStudent = new String[maxCapacity];

    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity = maxCapacity;
    }

    void enrollStudent(String studentName){
        enrollStudent[enrolled] = studentName;
        enrolled++;
    }

    int unenrolledStudent = 50;

    void unenrollStudent(String studentName) {
        enrollStudent[unenrolledStudent] = studentName;
        unenrolledStudent--;
    }






}
