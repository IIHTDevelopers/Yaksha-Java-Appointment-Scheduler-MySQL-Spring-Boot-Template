package com.appointment.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.appointment.dto.DoctorDTO;
import com.appointment.service.DoctorService;

import javassist.NotFoundException;

@Service
public class DoctorServiceImpl implements DoctorService {

	@Override
	public DoctorDTO createDoctor(DoctorDTO doctorDTO) {
		return null;
	}

	@Override
	public DoctorDTO updateDoctor(Long id, DoctorDTO doctorDTO) throws NotFoundException {
		return null;
	}

	@Override
	public List<DoctorDTO> getAllDoctors() {
		return null;
	}

	@Override
	public DoctorDTO getDoctorById(Long id) throws NotFoundException {
		return null;
	}

	@Override
	public boolean deleteDoctor(Long id) throws NotFoundException {
		return false;
	}

	@Override
	public List<DoctorDTO> findDoctorsBySpecialty(String specialty) {
		return null;
	}
}
