package MVC;

public class MVCDemo {
    private static Student getStudentFromDB() {
        Student student = new Student();
        student.setName("Student A");
        student.setRollNo("1");
        return student;
    }

    public static void main(String[] args) {
        Student model = getStudentFromDB();
        View view = new View();

        Controller controller = new Controller(model, view);
        controller.updateView();

        controller.setStudentName("Student B");
        controller.updateView();
    }
}
