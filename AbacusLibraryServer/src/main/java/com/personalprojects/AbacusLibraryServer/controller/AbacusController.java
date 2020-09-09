package com.personalprojects.AbacusLibraryServer.controller;


//import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.personalprojects.AbacusLibraryServer.entityClasses.LockerEntity;
import com.personalprojects.AbacusLibraryServer.service.AbacusService;



@RestController
public class AbacusController {
	
	@Autowired
	AbacusService abacusService;
	
	@GetMapping("/locker/{number}")
	public ResponseEntity<?> getLockersByStudentId(@PathVariable Integer studentId){
		Set<LockerEntity> lockersByStudentId=abacusService.findLockerByStudentId(studentId);
		return new ResponseEntity<>(lockersByStudentId, HttpStatus.FOUND);
	}
	
	@GetMapping("/locker/freelockers")
	public ResponseEntity<?> getFreeLockers(){
		Set<LockerEntity> freeLockers=abacusService.findFreeLockers();
		return new ResponseEntity<>(freeLockers, HttpStatus.FOUND);
	}
	
//	one time run
//	@GetMapping("/locker/savealllockers")
//	public ResponseEntity<?> saveAllLockers() {
//		List<LockerEntity> lockers= new ArrayList<LockerEntity>();
//		for(int i=2;i<=99;i++) {
//			LockerEntity l=new LockerEntity();
//			l.setStudentId(null);
//			l.setLockerNumber((Integer)i);
//			lockers.add(l);
//		}
//		
//		List<LockerEntity> savedLockers=abacusService.saveAllLockers(lockers);
//		
//		return new ResponseEntity<>(savedLockers, HttpStatus.FOUND);
//	}
	
	
	///////////////asdkjfhaskjdf//////////////////
	
}