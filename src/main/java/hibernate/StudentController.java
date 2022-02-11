package hibernate;

import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.random.RandomGenerator;

@Component
public class StudentController {

    @Resource
    StudentService studentService;

    public void crudOperations() {

        List<Student> students = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            Student student = new Student();
            student.setName("name_" + i);
            student.setMark(RandomGenerator.getDefault().nextInt(2,5));
            students.add(student);
        }

        studentService.saveStudents(students);

        Student student123 = studentService.getStudent(123L);
        student123.setName("new_" + student123.getName());
        studentService.saveStudent(student123);

        Student student777 = studentService.getStudent(777L);
        studentService.removeStudent(student777);
    }
}
