package com.personalprojects.AbacusLibraryServer.entityClasses;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Set;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="student")
public class StudentEntity {
	@Id
	@Column(name="studentid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentId;
	@Column(name="studentname")
	private String studentName;
	@Column(name="studentphonenumber")
	private String studentPhoneNumber;
	@Column(name="fathername")
	private String fatherName;
	@Column(name="fatherphonenumber")
	private String fatherPhoneNumber;
	@Column(name="studentemail")
	private String studentEmail;
	@Column(name="studentprofession")
	private String studentProfession;
	@Column(name="studentpermanentadderss")
	private String studentPermanentAdderss;
	@Column(name="studentcorrespondenceaddress")
	private String studentCorrespondenceAddress;
	@Column(name="studentaadharnumber")
	private String studentAadharNumber;
	@Column(name="dateofjoining")
	private LocalDate dateOfJoining;
	@Column(name="mode")
	private int mode;
	@Column(name="starttime")
	private LocalDateTime startTime;
	@Column(name="endtime")
	private LocalDateTime endTime;
	@Column(name="reservedseat")
	private boolean reservedSeat;
	@Column(name="seatnumber")
	private String seatNumber;
	@OneToMany(cascade = CascadeType.ALL,orphanRemoval = true)
	private Set<LockerEntity> lockers;
	

}
