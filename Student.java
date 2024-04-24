import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Student {

    private static int nextIndexNumber = 1;

    private String firstName;
    private String lastName;
    private String email;
    private String address;
    private String indexNumber;
    private Date dateOfBirth;
    private String status;
    private List<StudyProgramme> studyProgrammes = new ArrayList<>();
    private int currentSemester = 1;

    public Student(String firstName, String lastName, String email, String address, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.indexNumber = "s" + nextIndexNumber++;
        this.status = "Candidate";
    }

    public void enrollStudent(StudyProgramme studyProgramme) {
        studyProgrammes.add(studyProgramme);
    }

    public void addGrade(int grade, String subject) {
    }

    public void promoteToNextSemester() {
        if (currentSemester < studyProgrammes.get(0).getNumberOfSemesters()) {
            currentSemester++;
            if (currentSemester == studyProgrammes.get(0).getNumberOfSemesters()) {
                status = "Graduate";
            }
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public String getStatus() {
        return status;
    }

    private static List<Student> studentList = new ArrayList<>();
}
