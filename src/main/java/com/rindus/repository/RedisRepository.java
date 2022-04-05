package com.rindus.repository;

import java.util.List;
import java.util.Map;

import org.springframework.data.repository.CrudRepository;

import com.rindus.dto.RegRequestDTO;
import com.rindus.dto.RegsDTO;
import com.rindus.model.Model;

public interface RedisRepository<T> {

	double calculateRegresionCoef(Map<T, String> reg);

}
