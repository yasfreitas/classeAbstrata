package ativ_calculos;

public class Principal {
	
	public static void main(String[] args) {
		
	Calculando calculo = new Calculando();
	System.out.println(calculo.somar(10, 25));
	System.out.println(calculo.sub(35, 15));
	System.out.println(calculo.multi(5, 8));
	System.out.println(calculo.div(18, 2));
	System.out.println(calculo.exp(2, 6));
	
	}
}
