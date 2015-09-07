package exercicio7;

public class VeiculoCarga extends Veiculo {
	
	protected double capacidadeCarga;
	
	public VeiculoCarga(){		
	}

	public VeiculoCarga(String placa,String marca,String modelo,int ano,int valorKmRodado,int kmInicial,int kmFinal,double capacidadeCarga){
		this.placa=placa;
		this.marca=marca;
		this.modelo=modelo;
		this.ano=ano;
		this.valorKmRodado=valorKmRodado;
		this.kmInicial= kmInicial;
		this.kmFinal= kmFinal;
		this.valorLocacao= (kmInicial-kmFinal)*valorKmRodado;
		this.capacidadeCarga=capacidadeCarga;
	}
	
	public void setValorLocacao(){
		this.valorLocacao=(kmInicial-kmFinal)*valorKmRodado;
	}
	
	public double getCapacidadeCarga() {
		return capacidadeCarga;
	}

	public void setCapacidadeCarga(double capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}

	public String toString(){
		return "|Veículo de Carga|"+"\n"+"Placa: "+placa+"\n"+"Marca: "+marca+"\n"+"Modelo: "+modelo+"\n"+"Ano: "+ano+"\n"+"Km rodados: "+valorKmRodado+"\n"+"Km inicial: "+kmInicial+"\n"+"Km final: "+kmFinal+"\n"+"Capacidade de Carga (Valor em toneladas): "+capacidadeCarga+"\n"+"Valor da Locação: "+valorLocacao;
	}

}
