package la.cps.cdds.DAO;

import la.cps.cdds.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class StudentDAO {

    @Autowired
                private static Map<Integer,Student>students ;
        static{
            students=new HashMap<Integer, Student>() {
                {
                    put(1, new Student(1, "carlos", "ingenieria"));
                    put(1, new Student(2, "valeria", "ingenieria"));
                    put(1, new Student(2, "patricia", "arquitectura"));
                }
            };
        }

    public Collection<Student> getAllStudents(){
        return this.students.values();
    }

}
