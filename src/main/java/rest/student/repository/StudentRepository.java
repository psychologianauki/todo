package rest.student.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import rest.student.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
}
