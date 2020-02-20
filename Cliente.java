package entities;

public class Cliente {
	 public String nome;
	 public String CPF; 
	 public String telefone;
	 public Carro carro;
	
	 public Cliente() {
		 
	 }
	 
	 public Cliente(String nome, String cPF, String telefone, Carro carro) {
		this.nome = nome;
		CPF = cPF;
		this.telefone = telefone;
		this.carro = carro;
	}
	 
	 public void atualizaProgresso(float progresso) {
		 if (this.carro.progresso < progresso) {
			 System.out.println("Ainda estamos terminando a manuteção! Aguarde mais 48h por favor.");
			 this.carro.progresso = progresso;
		 }
		 else{
			
			 System.out.println("Progresso invalido");
		 }
	 
	 }
	 
	 public void display() {
		 System.out.println("Nome do cliente: " + nome + ", CPF: " + CPF +", Telefone: "+ telefone + ".");
		 carro.display();
	 }
	 
	 
}
