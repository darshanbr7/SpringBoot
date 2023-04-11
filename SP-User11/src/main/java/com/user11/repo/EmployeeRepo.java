package com.user11.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.user11.Employee.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> {
	@Modifying
	@Query("update Employee s SET s.name = :name WHERE s.id = :id")
	public void updateEmployeeUsingQueryAnnotation( @Param("id")  Integer id,@Param("name") String name);
*/
}
