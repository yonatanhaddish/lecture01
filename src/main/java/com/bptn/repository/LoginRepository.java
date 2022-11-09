package com.bptn.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.bptn.models.Students;

import java.util.List;

@Repository
public interface LoginRepository extends JpaRepository<Students, String> {
	
	@Query(value = "SELECT * FROM students WHERE studentName = ?1", nativeQuery = true)
	
	List<Students> getUserByUserId(String studentName);

}
