public class Main {
    public static void main(String[] args) {
    }
}

class Course {
    String courseName;
    int numberOfStudents;
    static int totalStudents = 0;
    static int totalCourses = 0;

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
        if (numberOfStudents == 0) {
            System.out.println(
                    "Statistics cannot be displayed because the course has no registered students."
            );
        } else if (studentsPresent < 0
                || studentsPresent > numberOfStudents) {
            System.out.println(
                    "The number of students present must be between 0 and "
                            + numberOfStudents + "."
            );
        } else {
            double attendancePercentage =
                    (studentsPresent * 100.0) / numberOfStudents;

            System.out.println("Course Name: " + courseName);
            System.out.println("Registered Students: " + numberOfStudents);
            System.out.println("Students Present: " + studentsPresent);
            System.out.println(
                    "Attendance Percentage: " + attendancePercentage + "%"
            );
            System.out.println("-----------------");
        }
    }
}