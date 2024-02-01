public class Studentinfo {
    public String name;
    public int grade;

    public Studentinfo(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public void saveName(String name) {
        this.name = name;
    }

    public String returnName() {
        return name;
    }

    public void saveGrade(int grade) {
        this.grade = grade;
    }

    public int returnGrade() {
        return grade;
    }

    public String calculateGrade() {
        if (grade >= 90 && grade <= 100) {
            return "A";
        } else if (grade >= 80 && grade <= 89) {
            return "B";
        } else if (grade >= 70 && grade <= 79) {
            return "C";
        } else if (grade >= 60 && grade <= 69) {
            return "D";
        } else if (grade >= 50 && grade <= 59) {
            return "E";
        } else {
            return "Invalid Grade";
        }
    }
}
