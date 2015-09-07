package exercicio6;

public class FitasInfantis extends Fitas {
	
	public FitasInfantis(String titulo,double preco){
		this.titulo=titulo;
		this.preco= preco-((preco*40)/100);
	}
	
	public FitasInfantis(){		
	}
	
	public void setPreco(double preco){
		this.preco= preco-((preco*40)/100);
	}
	
	public String toString(){
		return "Titulo: "+titulo+"\n"+"preco: "+preco;
	}
}
