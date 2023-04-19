package com.excel.results.controller;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.excel.results.repository.ModuleProgrammeStatusRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import zw.co.excel.results.GenerateExcel;

@RestController
@RequiredArgsConstructor
@Slf4j
public class ExcelController {

	private final ModuleProgrammeStatusRepository moduleProgrammeStatusRepository;

	@GetMapping(value = "/test")
	public void test() {

		GenerateExcel ge = new GenerateExcel();
		ge.main(null);
		log.info("moduleProgrammeStatusRepository :{}");

	}

	@GetMapping(value = "/generate/excel/{programmeCode}/{yearofstudy}")
	public void generateExcel(@PathVariable String programmeCode, @PathVariable String yearofstudy) {
		log.info(" http get method : generateExcel :{} ,{}", programmeCode, yearofstudy);
		GenerateExcel ge = new GenerateExcel();
		try {
			ge.generateExcel(programmeCode, yearofstudy);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
