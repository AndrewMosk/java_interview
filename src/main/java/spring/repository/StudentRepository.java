package spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import spring.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}
