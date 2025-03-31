package sec01.exam02;

public class StudentExample {
    public static void main(String[] args) {
        Student student = new Student("오동이","123456-7890133",1);
        System.out.println("student.name ="+student.name);
        System.out.println("student.ssn = " + student.ssn);
        System.out.println("student.studentNO = " + student.studentNO);


    }
}
