package in.pranav.CRUDspringbootdemo.controller;


import in.pranav.CRUDspringbootdemo.entity.Student;
import in.pranav.CRUDspringbootdemo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/students")
public class StudentController
{
    private StudentService studentservice;
    public StudentController(StudentService studentservice)
    {
        this.studentservice = studentservice;
    }

    @PostMapping("/create")
    public ResponseEntity <Student> createStudent(@RequestBody Student student)
    {
        System.out.println("inside student Controller");
        Student createdstudent = studentservice.createStudent(student);
        System.out.println("exit from student Controller");
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(createdstudent) ;


    }
    @GetMapping("get/{id}")
    public ResponseEntity <Student> getStudent(@PathVariable  Long id)
    {
        Student studentresp = studentservice.getStudent(id) ;
        if(studentresp == null)
        {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(studentresp) ;
    }

}
