package com.hospital.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.jpa.bean.Patient;
import com.hospital.service.PatienceService;



import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/patient")

	public class PatientController {

		@Autowired
		private PatienceService patientService;

	
		@PostMapping
		public ResponseEntity<Patient> save(@RequestBody Patient patient) {
			log.info("Saving patient {}", patient);

			patientService.save(patient);

			ResponseEntity<com.hospital.jpa.bean.Patient> responseEntity = new ResponseEntity<>(patient,
					HttpStatus.CREATED);
			return responseEntity;
		}

		@GetMapping(path = "/{id}")
		public ResponseEntity<Patient> get(@PathVariable Long id) {
			log.info("Fetching patient {}", id);

			Patient patient = patientService.get(id);

			ResponseEntity<Patient> responseEntity = new ResponseEntity<>(patient,
					HttpStatus.OK);
			return responseEntity;
		}
		@GetMapping(path="/getAll")
		public ResponseEntity <List<Patient>> getAll()
		{
			log.info("getting all patients");
			List<Patient> patient=patientService.getAll();
			ResponseEntity <List<Patient>> responseEntity=new ResponseEntity<>(patient,HttpStatus.OK);
			return responseEntity;
		}
		@DeleteMapping(path = "/{id}")
		public String deleteById(@PathVariable Long id) {
			log.info("deleting patient {}", id);

			 patientService.deleteById(id);
			return "deleted successfully";
		}

	
}
