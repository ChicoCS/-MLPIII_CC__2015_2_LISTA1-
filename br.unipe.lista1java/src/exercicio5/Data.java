package exercicio5;

public class Data {
	
	private int dia;
	private int mes;
	private int ano;
	
	public Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public int getDia() {
		return dia;
	}
	public void setDia(int dia) {
		this.dia = dia;
		/*if(this.dia<0||this.dia>31)
			System.out.println("Data Inválida!");*/
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
		/*if(this.mes<0||this.mes>12)
			System.out.println("Data Inválida!");*/
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	/*	if(this.ano<0)
			System.out.println("Data Inválida!");*/
	}
	public Data() {
	}
	
	public void validate() throws DataInvalidaException{
		if((dia < 1 || dia > 31) || (mes < 1 || mes > 12) || (ano < 1)){
			throw new DataInvalidaException(toString()+" (Data Inválida)");
		}
	}

		public String toString() {
			return dia + "/" + mes + "/" + ano;
		}
	}
