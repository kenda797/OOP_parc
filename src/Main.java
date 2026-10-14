public class Main {
    public static void main(String[] args) {
    }
}

class Course {
    String courseName;
    int numberOfStudents;

    public Course(String courseName, int numberOfStudents) {
        this.courseName = courseName;

        if (numberOfStudents > 0) {
            this.numberOfStudents = numberOfStudents;
        } else {
            System.out.println(
                    "The number of students must be greater than zero."
            );
            this.numberOfStudents = 0;
        }
    }
}