package spring.data.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import spring.data.entity.Employee;


@Repository
public interface EmployeeRepo extends CrudRepository<Employee, Integer>{

}
