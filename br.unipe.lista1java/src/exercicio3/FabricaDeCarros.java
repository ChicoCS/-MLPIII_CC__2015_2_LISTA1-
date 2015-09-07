package exercicio3;

public class FabricaDeCarros {
	
	private static FabricaDeCarros fabrica = new FabricaDeCarros();

	private FabricaDeCarros(){		
	}
	
	public static FabricaDeCarros getFabrica() {
		return fabrica;
	}
}
