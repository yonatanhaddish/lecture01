package com.bptn.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bptn.models.Students;

@Repository
public interface LoginRepository extends JpaRepository<Students, String> {
	
	@Query(value = "SELECT * FROM students WHERE studentName = ?1", nativeQuery = true)
	
	List<Students> getStudentById(String studentName);

}
