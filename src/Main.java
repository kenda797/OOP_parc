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
    public void displayStatistics(int studentsPresent) {
        double attendancePercentage =
                (studentsPresent * 100.0) / numberOfStudents;

        System.out.println("Course Name: " + courseName);
        System.out.println("Registered Students: " + numberOfStudents);
        System.out.println("Students Present: " + studentsPresent);
        System.out.println(
                "Attendance Percentage: " + attendancePercentage + "%"
        );
    }

}