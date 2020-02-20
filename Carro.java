package entities;

public class Carro {
	public String placa;
	public float progresso;
	public String modelo;
	
	public Carro() {
		
	}

	public Carro(String placa, float progresso, String modelo) {
		this.placa = placa;
		this.progresso = progresso;
		this.modelo = modelo;
	}
	
	public void display() {
		System.out.printf("Placa: " + placa+ ", Progresso: "+ progresso + ", Modelo: " + modelo + ".");
	}
	 public String toString() {
		 return "Placa: " + placa+ ", Progresso: "+ progresso +  "Modelo: " + modelo + " .";
	 }
}
