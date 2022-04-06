package com.rindus.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.rindus.dto.LogCoefResponseDTO;
import com.rindus.repository.ModelRepository;
import com.rindus.service.LogCoefCalculationService;

@RestController
@RequestMapping("/")
public class ModelController<T> {
	@Autowired
	ModelRepository modelRepository;
	@Autowired
	LogCoefCalculationService logCoefCalculationService;
	@RequestMapping(path = "calculateRegresion", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public @ResponseBody ResponseEntity<?> getCoeficiente(HttpServletRequest req, @RequestBody Map<T, String> logRegMap) {
		LogCoefResponseDTO logDTO=logCoefCalculationService.getLogCoef(logRegMap);
		return new ResponseEntity<>(logDTO, HttpStatus.OK);
	}

}
