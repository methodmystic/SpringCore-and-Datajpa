package in.pranav.CRUDspringbootdemo.service;

import in.pranav.CRUDspringbootdemo.controller.StudentController;
import in.pranav.CRUDspringbootdemo.entity.Student;
import in.pranav.CRUDspringbootdemo.repository.StudentRepository;
import org.hibernate.annotations.SecondaryRow;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class StudentService
{
    private StudentRepository studentrepository;
    public StudentService(StudentRepository studentrepository)
    {
        this.studentrepository = studentrepository;
    }
    public Student createStudent(Student studentreq)
    {
        System.out.println("inside student service ");
        Student studentrespo = studentrepository.save(studentreq);
        System.out.println("exit from student service");
        return studentrespo ;
    }
    public Student getStudent(long id)
    {
       Optional<Student> studentrespo = studentrepository.findById(id) ;
       if(studentrespo.isPresent())
       {
           return studentrespo.get();
       }
       return null ;
    }


}

