package com.example.Employee.reoisitory;

import com.example.Employee.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    List<Employee> findAll();

    Optional<Object> findById(long id);

    Employee save(Employee employee);

    void deleteById(long id);
}
