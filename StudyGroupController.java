import java.util.Arrays;
import java.util.List;

public class StudyGroupController {
    private StudyGroupService studyGroupService = new StudyGroupService();

    public List<Student> getStudents() {
        return Arrays.asList(new Student(1, "Alice"), new Student(2, "Bob"), new Student(3, "Charlie"));
    }

    public Teacher getTeacher() {
        return new Teacher(1, "Dr. Smith");
    }

    public StudyGroup createStudyGroup() {
        List<Student> students = getStudents();
        Teacher teacher = getTeacher();
        return studyGroupService.createStudyGroup(teacher, students);
    }

    public static void main(String[] args) {
        StudyGroupController controller = new StudyGroupController();
        StudyGroup studyGroup = controller.createStudyGroup();

        System.out.println("Teacher: " + studyGroup.getTeacher().getName());
        System.out.println("Students:");
        for (Student student : studyGroup.getStudents()) {
            System.out.println("- " + student.getName());
        }
    }
}

