package exercicio7;

public class Main {
	
	public static void main(String[] args){
		
		VeiculoCarga veiculo1= new VeiculoCarga();
		VeiculoPasseio veiculo2= new VeiculoPasseio("GDK-1234","Wolksvagen","Gol",2014,60,78,40,4,"sim");
		
		veiculo1.setPlaca("GDK-4321");
		veiculo1.setMarca("Renault");
		veiculo1.setModelo("Renault Kangoo");
		veiculo1.setAno(2014);
		veiculo1.setValorKmRodado(100);
		veiculo1.setKmInicial(0);
		veiculo1.setKmFinal(70);
		veiculo1.setValorLocacao(7000);
		veiculo1.setCapacidadeCarga(2);
		
		System.out.println(veiculo2);
		System.out.println("\n"+ veiculo1);
	}

}
