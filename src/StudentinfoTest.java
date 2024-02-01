public class StudentinfoTest {
    public static void main(String[] args) {
        Studentinfo student = new Studentinfo("John Doe", 70);
        String calculatedGrade = student.calculateGrade();

        System.out.println("The calculated grade is: " + calculatedGrade);
    }

}
