package com.appointment.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appointment.entity.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
	// write your logic here
}
