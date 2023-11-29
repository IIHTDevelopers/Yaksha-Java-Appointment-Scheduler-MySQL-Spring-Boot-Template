package com.appointment.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.appointment.service.ScheduleService;

@RestController
@RequestMapping("/api/schedules")
public class ScheduleController {

	private final ScheduleService scheduleService = null;

}
