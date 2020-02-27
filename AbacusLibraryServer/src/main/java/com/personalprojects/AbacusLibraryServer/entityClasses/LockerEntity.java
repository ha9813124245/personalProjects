package com.personalprojects.AbacusLibraryServer.entityClasses;

import javax.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name="locker")
public class LockerEntity {
	@Id
	@Column(name="lockernumber")
	private Integer lockerNumber;
	@Column(name="studentid")
	private Integer studentId;

}
