package com.hospital.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.jpa.bean.Patient;
import com.hospital.repository.PatientRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class PatienceServiceImpl implements PatienceService {

	@Autowired
	public PatientRepository patientRepository;
	@Override
	public void save(Patient patient) {
		patientRepository.save(patient);
		log.info("Patient details saved {} ", patient);
	}

	@Override
	public Patient get(Long id) {
		return patientRepository.findById(id).get();
	}

	@Override
	public List<Patient> getAll() {
		
		return patientRepository.findAll();
	}

	@Override
	public String deleteById(Long id) {
		patientRepository.deleteById(id);
		return "deleted";
	}


	

}
