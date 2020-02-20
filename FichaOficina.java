package entities;

public class FichaOficina {
	
	public Cliente cliente;
	public int identificador;
	public String problema;
	
	public FichaOficina() {
		
	}

	public FichaOficina(Cliente cliente, int identificador, String problema) {
		this.cliente = cliente;
		this.identificador = identificador;
		this.problema = problema;
	}
	
	
	public void display() {
		 cliente.display();
		 System.out.println();
		 System.out.println("Identificador: " + identificador + ", Problema: " + problema + "."); 
	}
}
