package spring.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import spring.entity.Student;
import spring.repository.StudentRepository;


@RequestMapping("/student")
@Controller
public class StudentController {

    private static final Logger logger = LoggerFactory.getLogger(StudentController.class);

    private final StudentRepository studentRepository;

    @Autowired
    public StudentController(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @GetMapping
    public String studentList(Model model) {

        logger.info("Students list");
        model.addAttribute("students", studentRepository.findAll());

        return "students";
    }

    @GetMapping("new")
    public String createStudent(Model model) {
        logger.info("Create student form");

        model.addAttribute("student", new Student());
        return "student";
    }

    @GetMapping("edit")
    public String editStudent(@RequestParam("id") Long id, Model model) {
        logger.info("Edit student with id " + id);

        model.addAttribute("student", studentRepository.findById(id)
                .orElseThrow(NotFoundException::new));
        return "student";
    }

    @PostMapping
    public String saveStudent(Student student) {
        logger.info("Save student method");

        studentRepository.save(student);
        return "redirect:/student";
    }

    @DeleteMapping
    public String deleteStudent(@RequestParam("id") Long id) {
        logger.info("Delete student with id " + id);

        studentRepository.deleteById(id);
        return "redirect:/student";
    }

}
