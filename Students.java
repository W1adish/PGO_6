/*
import java.util.ArrayList;
import java.util.List;

public class Students {
    private static List<Student> students = new ArrayList<>();

    public static void addStudent(Student student) {
        students.add(student);
    }

    public static void promoteAllStudents() {
        for (Student student : students) {
            if (!student.getStatus().equals("Graduate")) {
                if (student.getCurrentSemester() < student.getStudyProgrammes().size()) {
                    if (student.getITNs() <= student.getMaxITNsAllowed()) {
                        student.promoteToNextSemester();
                    } else {
                        student.setStatus("Graduate");
                    }
                } else {
                    student.setStatus("Graduate");
                }
            }
        }
    }

    public static void displayInfoAboutAllStudents() {
        for (Student student : students) {
            System.out.println("Student: " + student.getFirstName() + " " + student.getLastName());
            System.out.println("Index number: " + student.getIndexNumber());
            System.out.println("Status: " + student.getStatus());
            System.out.println("Current semester: " + student.getCurrentSemester());
            System.out.println("Programmes enrolled: ");
            for (StudyProgramme programme : student.getStudyProgrammes()) {
            System.out.println("- " + programme.getName());
            }
            System.out.println();
        }
    }

*/
