package la.cps.cdds.Service;

import la.cps.cdds.DAO.FakeStudentDAOImpl;
import la.cps.cdds.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
@Qualifier("fakeData")
public class StudentService {
    @Autowired
        private FakeStudentDAOImpl fakeStudentDAOImpl;


    public Collection<Student> getAllStudents(){
        return fakeStudentDAOImpl.getAllStudents();
    }

    public  Student getStudentById(Integer id){
        return this.fakeStudentDAOImpl.getStudentById(id);
    }

    public void removeStudentById(int id) {
        this.fakeStudentDAOImpl.removeStudentById(id);
    }

    public void updateStudent(Student student){
        this.fakeStudentDAOImpl.updateStudent(student);
    }


    public void insertStudent(Student student) {
        this.fakeStudentDAOImpl.insertStudent(student);
    }
}
