package com.personalprojects.AbacusLibraryServer.service;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.personalprojects.AbacusLibraryServer.entityClasses.LockerEntity;
import com.personalprojects.AbacusLibraryServer.entityClasses.StudentEntity;
import com.personalprojects.AbacusLibraryServer.repository.LockerRepository;
import com.personalprojects.AbacusLibraryServer.repository.StudentRepository;

@Service
@Transactional
public class AbacusServiceImpl implements AbacusService{
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private LockerRepository lockerRepository;
	
	@Override
	public StudentEntity save(StudentEntity studentEntity) {
		return studentRepository.save(studentEntity);
	}
	
	@Override
	public StudentEntity findStudentByStudentId(Integer studentId) {
		return studentRepository.findStudentByStudentId(studentId).orElse(null);
	}
	
	@Override
	public StudentEntity findByStudentName(String studentName) {
		studentName="%" + studentName + "%";
		return studentRepository.findByStudentName(studentName).orElse(null);
		
	}
	
	@Override
	public StudentEntity findByStudentPhoneNumber(String studentPhoneNumber) {
		studentPhoneNumber = "%" + studentPhoneNumber + "%";
		return studentRepository.findByStudentPhoneNumber(studentPhoneNumber).orElse(null);
		
	}
	
	@Override
	public List<StudentEntity> findAllStudents(){
		return studentRepository.findAll();
	}
	
	@Override
	public LockerEntity findByLockerNumber(Integer lockerNumber) {
		return lockerRepository.findByLockerNumber(lockerNumber).orElse(null);
	}
	
	@Override
	public Set<LockerEntity> findLockerByStudentId(Integer studentId) {
		return lockerRepository.findByStudentId(studentId);
		
	}
	
	@Override
	public Set<LockerEntity> findFreeLockers(){
		return lockerRepository.findFreeLockers();
	}
	
	@Override
	public List<LockerEntity> saveAllLockers(List<LockerEntity> lockers){
		return lockerRepository.saveAll(lockers);
	}

}
