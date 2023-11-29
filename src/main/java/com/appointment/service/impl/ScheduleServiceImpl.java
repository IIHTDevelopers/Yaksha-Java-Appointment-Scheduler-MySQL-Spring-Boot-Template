package com.appointment.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.appointment.dto.ScheduleDTO;
import com.appointment.service.ScheduleService;

import javassist.NotFoundException;

@Service
public class ScheduleServiceImpl implements ScheduleService {

	@Override
	public ScheduleDTO createSchedule(ScheduleDTO scheduleDTO) {
		return null;
	}

	@Override
	public ScheduleDTO updateSchedule(Long id, ScheduleDTO scheduleDTO) throws NotFoundException {
		return null;
	}

	@Override
	public List<ScheduleDTO> getAllSchedules() {
		return null;
	}

	@Override
	public ScheduleDTO getScheduleById(Long id) throws NotFoundException {
		return null;
	}

	@Override
	public boolean deleteSchedule(Long id) throws NotFoundException {
		return false;
	}

	@Override
	public List<ScheduleDTO> getDoctorAppointments(Long doctorId, String day) {
		return null;
	}

	public List<ScheduleDTO> getDoctorScheduleByDay(Long doctorId, String day) {
		return null;
	}
}
