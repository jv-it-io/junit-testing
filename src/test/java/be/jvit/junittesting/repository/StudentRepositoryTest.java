package be.jvit.junittesting.repository;

import be.jvit.junittesting.domain.Gender;
import be.jvit.junittesting.domain.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * @author Jonathan Vandersmissen
 * @created 4/5/2021
 * @project junit-testing
 */
@DataJpaTest
class StudentRepositoryTest {

    @Autowired
    private StudentRepository underTest;

    @Test
    void itShouldCheckIfStudentExistsEmail() {

        //Given
        String email = "josuke@email.com";
        Student student = new Student(
                "josuke",
                email,
                Gender.MALE
        );
        underTest.save(student);
        //When
        Boolean expected = underTest.selectExistsEmail(email);
        //Then
        assertThat(expected).isTrue();
    }
}