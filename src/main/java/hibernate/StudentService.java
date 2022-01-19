package hibernate;

import javax.annotation.Resource;
import java.util.List;

public class StudentService {

    @Resource
    StudentRepository repository;

    public void saveStudent(Student student) {
        repository.save(student);
    }

    public void saveStudents(List<Student> students) {
        repository.saveAll(students);
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student getStudent(Long id) {
        return repository.getById(id);
    }

    public void removeStudent(Student student) {
        repository.delete(student);
    }
}
