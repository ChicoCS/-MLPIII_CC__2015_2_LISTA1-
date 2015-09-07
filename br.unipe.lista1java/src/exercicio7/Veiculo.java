package exercicio7;

public class Veiculo {
	
	protected String placa;
	protected String marca;
	protected String modelo;
	protected int ano;
	protected int valorKmRodado;
	protected int kmInicial;
	protected int kmFinal;
	protected double valorLocacao;
	
	public String getPlaca() {
		return placa;
	}
	public double getValorLocacao() {
		return valorLocacao;
	}
	public void setValorLocacao(double valorLocacao) {
		this.valorLocacao = valorLocacao;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public int getValorKmRodado() {
		return valorKmRodado;
	}
	public void setValorKmRodado(int valorKmRodado) {
		this.valorKmRodado = valorKmRodado;
	}
	public int getKmInicial() {
		return kmInicial;
	}
	public void setKmInicial(int kmInicial) {
		this.kmInicial = kmInicial;
	}
	public int getKmFinal() {
		return kmFinal;
	}
	public void setKmFinal(int kmFinal) {
		this.kmFinal = kmFinal;
	}
	
}
