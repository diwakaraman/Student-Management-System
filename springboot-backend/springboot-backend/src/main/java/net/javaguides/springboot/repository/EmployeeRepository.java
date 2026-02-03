package net.javaguides.springboot.repository;

import jakarta.transaction.Transactional;
import net.javaguides.springboot.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //all crud databse methods
    Employee findById(String lastName);

    @Modifying
    @Transactional
    @Query(value = "update employees es set es.first_name = :firstname, es.last_name = :lastname where es.id = :id", nativeQuery = true)
    Integer updateEmployeeById(@Param("firstname") String firstname,
                               @Param("lastname") String lastname,
                               @Param("id") Long id);



}
