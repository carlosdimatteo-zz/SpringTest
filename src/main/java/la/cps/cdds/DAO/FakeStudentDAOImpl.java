package la.cps.cdds.DAO;

import la.cps.cdds.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
@Qualifier("fakeData")
public class FakeStudentDAOImpl implements StudentDAO {

    @Autowired
                private static Map<Integer,Student>students ;
        static{
            students=new HashMap<Integer, Student>() {
                {
                    put(1, new Student(1, "carlos", "ingenieria"));
                    put(2, new Student(2, "valeria", "ingenieria"));
                    put(3, new Student(2, "patricia", "arquitectura"));
                }
            };
        }

    @Override
    public Collection<Student> getAllStudents(){
        return this.students.values();
    }
    @Override
    public  Student getStudentById(Integer id){
            return this.students.get(id);
    }

    @Override
    public void removeStudentById(int id) {
            this.students.remove(id);
    }

    @Override
    public void updateStudent(Student student){
            Student s = this.students.get(student.getId());
            s.setCourse(student.getCourse());
            s.setName(student.getName());
            this.students.put(student.getId(),student);
    }


    @Override
    public void insertStudent(Student student) {
        this.students.put(student.getId(), student);

    }
}
