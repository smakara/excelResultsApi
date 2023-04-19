package com.excel.results.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.excel.results.model.ModuleProgrammeStatus;

@Repository
public interface ModuleProgrammeStatusRepository extends JpaRepository<ModuleProgrammeStatus, Long> {

	List<ModuleProgrammeStatus> findByProgrammeCodeAndYearOfStudy(String programmeCode, String yearOfStudy);

}
