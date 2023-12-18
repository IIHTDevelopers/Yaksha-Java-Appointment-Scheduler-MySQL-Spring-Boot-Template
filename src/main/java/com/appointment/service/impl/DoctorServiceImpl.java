package com.appointment.service.impl;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.appointment.dto.DoctorDTO;
import com.appointment.entity.Schedule;
import com.appointment.service.DoctorService;

import javassist.NotFoundException;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Override
	public DoctorDTO createDoctor(DoctorDTO doctorDTO) {
		// write your logic here
		return null;
	}

	@Override
	public DoctorDTO updateDoctor(Long id, DoctorDTO doctorDTO) throws NotFoundException {
		// write your logic here
		return null;
	}

	@Override
	public List<DoctorDTO> getAllDoctors() {
		// write your logic here
		return null;
	}

	@Override
	public DoctorDTO getDoctorById(Long id) throws NotFoundException {
		// write your logic here
		return null;
	}

	@Override
	public boolean deleteDoctor(Long id) throws NotFoundException {
		// write your logic here
		return false;
	}

	@Override
	public List<DoctorDTO> findDoctorsBySpecialty(String specialty) {
		// write your logic here
		return null;
	}

	@Override
	public List<Schedule> findSchedulesByDoctorNameAndSpecialty(String doctorName, String specialty) {
		// write your logic here
		return null;
	}

	@Override
	public List<Schedule> findSchedulesByDoctorId(Long doctorId) {
		// write your logic here
		return null;
	}

	@Override
	public Page<DoctorDTO> findAllByOrderBySpecialtyAsc(Pageable pageable) {
		// write your logic here
		return null;
	}

}
