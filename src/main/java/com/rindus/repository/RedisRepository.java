package com.rindus.repository;

import java.util.Map;

public interface RedisRepository<T> {

	double calculateRegresionCoef(Map<T, String> reg);

}
