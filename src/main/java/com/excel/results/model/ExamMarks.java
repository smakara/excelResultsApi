package com.excel.results.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "tblexam_marks")
public class ExamMarks {

	@Id
	@Column(name = "")
	private Long id;

	private String student_number;
	private int exam_session_id;
	private String programme_code;
	private String module_code;
	private String seating_id;
	private double coursework_mark;
	private double exam_mark;
	private double overall_mark;
	private String grade;
	private String year_of_study;
	private String semester_of_study;
	private String decision;
	private int publish_status;
	private int exam_marks_stage;
	private String user;
	private java.util.Date created_at;
	private java.util.Date updated_at;

}
