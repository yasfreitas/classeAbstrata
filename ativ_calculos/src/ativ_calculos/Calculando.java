package ativ_calculos;

public class Calculando implements Calculoss {
	 
	@Override
	public double somar(double a, double b) {
		return a+b;
	}
	
	@Override
	public double sub(double a, double b) {
		return a-b;
	}
	
	@Override
	public int exp(int a, int b) {
		return a^b;
	}
	
	@Override
	public double multi(double a, double b) {
		return a*b;
	}
	
	@Override
	public int div(int a, int b) {
		return a/b;
	}
	

}
