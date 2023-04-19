package com.excel.results.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.excel.results.model.ExamMarks;

public interface ExamMarksRepository extends JpaRepository<ExamMarks, Long> {

}
