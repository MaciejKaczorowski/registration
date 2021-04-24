import dao.IStudentsDao;
import dao.StudentsDao;
import model.Students;

public class MainApp {
    public static void main(String[] args) {
        Students student1 = new Students();
        student1.setFirstName("Mateusz");
        student1.setLastName("C");
        student1.setEmail("admin@admin.pl");
        student1.setPassword("admin");

        IStudentsDao studentsDao = new StudentsDao();
        studentsDao.addStudent(student1);
    }

}
