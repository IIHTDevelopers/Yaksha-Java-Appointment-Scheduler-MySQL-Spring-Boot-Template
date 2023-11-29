package com.appointment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appointment.service.DoctorService;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

	private final DoctorService doctorService = null;

}
