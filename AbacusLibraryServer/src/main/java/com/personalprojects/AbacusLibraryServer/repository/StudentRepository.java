package com.personalprojects.AbacusLibraryServer.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.personalprojects.AbacusLibraryServer.entityClasses.StudentEntity;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Integer> {
	
	Optional<StudentEntity> findStudentByStudentId(Integer studentId);
	
	@Query("select s from StudentEntity s where s.studentName like :sname")
	Optional<StudentEntity> findByStudentName(@Param("sname")String studentName);
	
	@Query("select s from StudentEntity s where s.studentPhoneNumber like :spno")
	Optional<StudentEntity> findByStudentPhoneNumber(@Param("spno")String studentPhoneNumber);
	

}
