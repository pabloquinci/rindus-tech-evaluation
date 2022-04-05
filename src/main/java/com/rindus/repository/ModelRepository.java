package com.rindus.repository;

import java.util.Iterator;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import com.rindus.consts.ModelConsts;
import com.rindus.strategy.FormulaRegresionLogisticaStrategy;

@Repository

public class ModelRepository implements RedisRepository {

	@Autowired
	private RedisTemplate<String, String> redisTemplate;

	@Resource(name = "redisTemplate")
	private ListOperations<String, String> listOps;

	public void addLink(String key, String value) {
		listOps.leftPush(key, value);
	}

	@Override
	public double calculateRegresionCoef(Map reg) {
		// TODO Auto-generated method stub
		Double sumaCoefTotal = 0.0;
		FormulaRegresionLogisticaStrategy formula = new FormulaRegresionLogisticaStrategy();
		Iterator it = reg.entrySet().iterator();
		double valorBias = Double.valueOf(redisTemplate.opsForHash().get(ModelConsts.KEY, "bias").toString());

		while (it.hasNext()) {
			String claveValor = it.next().toString();
			double valor = Double.valueOf(redisTemplate.opsForHash().get(ModelConsts.KEY, claveValor).toString());
			sumaCoefTotal += valor;
		}
		sumaCoefTotal += valorBias;

		return formula.aplicar(sumaCoefTotal);
	}

}
