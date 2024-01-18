package com.hospital.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hospital.jpa.bean.Patient;



public interface PatientRepository extends JpaRepository<Patient, Long> {

}
