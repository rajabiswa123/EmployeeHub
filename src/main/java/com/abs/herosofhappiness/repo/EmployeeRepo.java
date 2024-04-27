package com.abs.herosofhappiness.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.abs.herosofhappiness.entity.Employee;
import com.abs.herosofhappiness.entity.Project;


@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	Employee findByEmail(String email);
	@Query("select e.project from Employee e where e.e_id=?1")
	public List<Project> findProjectByEmpId(int id);
	
}
