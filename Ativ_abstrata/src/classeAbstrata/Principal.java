package classeAbstrata;

public class Principal {
	
	public static void main(String[] args) {
		
		Carro ferrari = new Carro("374829", "F1", "Vermelho",2018);
		ferrari.ligar();
		ferrari.acelerar();
		ferrari.virar();
		ferrari.frear();
		
		System.out.println("---------------------------");
		
		Onibus marcopolo = new Onibus("63274", "XB1", "Prata", 2017);
		marcopolo.ligar();
		marcopolo.acelerar();
		marcopolo.frear();
		marcopolo.virar();
		
	}

}
