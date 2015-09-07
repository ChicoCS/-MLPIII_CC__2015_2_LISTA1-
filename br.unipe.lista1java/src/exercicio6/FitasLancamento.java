package exercicio6;

public class FitasLancamento extends Fitas{
	
	public FitasLancamento(String titulo,double preco){
		this.titulo=titulo;
		this.preco= preco+((preco*20)/100);
	}
	
	public FitasLancamento(){		
	}
	
	public void setPreco(double preco){
		this.preco= preco+((preco*20)/100);
	}
	
	public String toString(){
		return "Titulo: "+titulo+"\n"+"preco: "+preco;
	}

}
