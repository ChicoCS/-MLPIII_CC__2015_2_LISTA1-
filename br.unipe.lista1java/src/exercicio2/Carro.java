package exercicio2;

public class Carro {
	
	private String cor;
	private String modelo;
	private int velocidadeAtual;
	private int velocidadeMax;
	
	public Carro(String cor,String modelo,int velocidadeAtual,int velocidadeMax){
		this.cor=cor;
		this.modelo=modelo;
		this.velocidadeAtual=velocidadeAtual;
		this.velocidadeMax=velocidadeMax;
	}

	public String getCor() {
		return cor;
	}

	public String getModelo() {
		return modelo;
	}
	
	public int getVelocidadeAtual() {
		return velocidadeAtual;
	}

	public int getVelocidadeMax() {
		return velocidadeMax;
	}

	public void ligar(){
		System.out.println("Carro Ligado");
	}
	
	public void acelerar(int aceleracao){
		this.velocidadeAtual=this.velocidadeAtual+aceleracao;
	    System.out.println("Acelerando!");
	    
		if(this.velocidadeAtual>this.velocidadeMax){
			System.out.println("Limite de velocidade ultrapassado!");
		}
			
	}
	public String toString(){
		return "Cor: "+this.cor+"\n"+"Modelo: "+this.modelo+"\n";
	}
}
