package com.rindus.strategy;

public class FormulaRegresionLogisticaStrategy implements FormulaStrategy {
	

	@Override
	public double aplicar(double sumatoriaCoeficientes) {
		return (double)((Math.exp(sumatoriaCoeficientes))/(1+ Math.exp(sumatoriaCoeficientes)));
		
	}
	
}
