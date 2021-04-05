package be.jvit.junittesting.repository;

import be.jvit.junittesting.domain.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * @author Jonathan Vandersmissen
 * @created 4/5/2021
 * @project junit-testing
 */
@Repository
public interface StudentRepository
        extends JpaRepository<Student, Long> {
    @Query("" +
            "SELECT CASE WHEN COUNT(s) > 0 THEN " +
            "TRUE ELSE FALSE END " +
            "FROM Student s " +
            "WHERE s.email = ?1"
    )
    Boolean selectExistsEmail(String email);
}