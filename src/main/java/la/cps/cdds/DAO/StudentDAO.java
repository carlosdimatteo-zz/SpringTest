package la.cps.cdds.DAO;

import la.cps.cdds.Entity.Student;

import java.util.Collection;

public interface StudentDAO {
    Collection<Student> getAllStudents();

    Student getStudentById(Integer id);

    void removeStudentById(int id);

    void updateStudent(Student student);

    void insertStudent(Student student);
}
