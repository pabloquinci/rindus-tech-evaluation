package com.rindus.service;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;

import com.rindus.dto.LogCoefResponseDTO;

public interface LogCoefCalculationService {
	
	public <T> LogCoefResponseDTO getLogCoef(Map<T, String> reg);

}
