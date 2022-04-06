package com.olx.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.olx.service.MasterService;
import com.olx.dto.*;

@RestController
@RequestMapping("/advertise")
@CrossOrigin(origins = "*")
public class MasterController {

	@Autowired
	MasterService masterService;

	@GetMapping(value = "/category", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Category> getAllCategory() {
		return masterService.getAllCategory();
	}

	@GetMapping(value = "/status", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Status> getAllStatus() {
		return masterService.getAllStatus();
	}
}
