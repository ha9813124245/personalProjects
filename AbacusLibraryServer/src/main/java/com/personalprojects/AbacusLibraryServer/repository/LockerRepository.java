package com.personalprojects.AbacusLibraryServer.repository;

//import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import org.springframework.stereotype.Repository;

import com.personalprojects.AbacusLibraryServer.entityClasses.LockerEntity;

@Repository
public interface LockerRepository extends JpaRepository<LockerEntity, Integer> {
	
	Optional<LockerEntity> findByLockerNumber(Integer lockerNumber);
	

	Set<LockerEntity> findByStudentId(Integer studentId);
	
	@Query("select l from LockerEntity l where l.studentId is null")
	Set<LockerEntity> findFreeLockers();
	//comment

}
