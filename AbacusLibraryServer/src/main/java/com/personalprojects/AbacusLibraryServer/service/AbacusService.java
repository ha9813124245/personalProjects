package com.personalprojects.AbacusLibraryServer.service;

import java.util.List;
import java.util.Set;

import com.personalprojects.AbacusLibraryServer.entityClasses.LockerEntity;
import com.personalprojects.AbacusLibraryServer.entityClasses.StudentEntity;

public interface AbacusService {

	StudentEntity save(StudentEntity studentEntity);

	StudentEntity findByStudentName(String studentName);

	StudentEntity findByStudentPhoneNumber(String studentPhoneNumber);

	List<StudentEntity> findAllStudents();

	StudentEntity findStudentByStudentId(Integer studentId);

	LockerEntity findByLockerNumber(Integer lockerNumber);

	Set<LockerEntity> findFreeLockers();

	Set<LockerEntity> findLockerByStudentId(Integer studentId);

	List<LockerEntity> saveAllLockers(List<LockerEntity> lockers);

}
