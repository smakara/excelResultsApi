package com.excel.results.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tblmoduleprogrammestatus")
public class ModuleProgrammeStatus {

	@Id
	@Column(name = "id")
	private Long id;

	@Column(name = "programmeCode")
	private String programmeCode;

	@Column(name = "offerProgrammeId")
	private int offerProgrammeId;

	@Column(name = "moduleCode")
	private String moduleCode;

	@Column(name = "progressionName")
	private String progressionName;

	@Column(name = "yearOfStudy")
	private String yearOfStudy;

	@Column(name = "semesterOfStudy")
	private String semesterOfStudy;

	@Column(name = "status")
	private String status;

	@Column(name = "moduleScheduleStatus")
	private String moduleScheduleStatus;

	@Column(name = "is_approved")
	private int is_approved;

	@Column(name = "moduleWeight")
	private double moduleWeight;

	@Column(name = "created_at")
	private java.util.Date created_at;

	@Column(name = "updated_at")
	private java.util.Date updated_at;
}
