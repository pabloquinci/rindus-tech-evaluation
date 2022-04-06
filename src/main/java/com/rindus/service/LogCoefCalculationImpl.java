package com.rindus.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.rindus.dto.LogCoefResponseDTO;
import com.rindus.repository.ModelRepository;
@Service
public class LogCoefCalculationImpl implements LogCoefCalculationService{
	@Autowired
	ModelRepository modelRepository;

	@Override
	public <T> LogCoefResponseDTO getLogCoef(Map<T, String> reg) {
		double coef = modelRepository.calculateRegresionCoef(reg);		
		return new LogCoefResponseDTO(coef);
	}

}
