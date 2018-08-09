package la.cps.cdds.Service;

import la.cps.cdds.DAO.StudentDAO;
import la.cps.cdds.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;
@Service
public class StudentService {
    @Autowired
        private StudentDAO studentDAO;


    public Collection<Student> getAllStudents(){
        return studentDAO.getAllStudents();
    }

}
