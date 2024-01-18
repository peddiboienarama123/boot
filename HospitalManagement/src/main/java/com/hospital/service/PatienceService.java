package com.hospital.service;

import java.util.List;

import com.hospital.jpa.bean.Patient;

public interface PatienceService {
	void save(Patient patient);

	Patient get(Long id);

	List<Patient> getAll();

	

	String deleteById(Long id);

	
}