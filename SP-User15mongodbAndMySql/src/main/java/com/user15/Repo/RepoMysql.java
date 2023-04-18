package com.user15.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user15.EmpEntity.EmployeeMysql;
@Repository
public interface RepoMysql extends JpaRepository<EmployeeMysql, Integer> {
	public EmployeeMysql getByeId( int id);
    public EmployeeMysql getByeName(String eName);

}
