package exercicio6;

public class Locadora {
	
	public static void main (String[] args){
				
		FitasLancamento fita1= new FitasLancamento();
		FitasInfantis fita2= new FitasInfantis();
			
		fita1.setTitulo("Homem de Ferro 3");
		fita1.setPreco(10.50);
			
		fita2.setTitulo("Teletubies");
		fita2.setPreco(6.50);
				
		System.out.println(fita2);
		System.out.println(fita1);
			
	}

}
