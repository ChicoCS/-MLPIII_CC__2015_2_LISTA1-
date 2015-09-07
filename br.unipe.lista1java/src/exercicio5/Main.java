package exercicio5;

import java.util.Scanner;
import exercicio5.Data;
import exercicio5.DataInvalidaException;

public class Main {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
			 
			Data data = new Data();
			
			System.out.println("Digite o Dia: ");
			data.setDia(in.nextInt());
			System.out.println("Digite o Mês: ");
			data.setMes(in.nextInt());
			System.out.println("Digite o Ano: ");
			data.setAno(in.nextInt());
				
			try {
				data.validate();
				System.out.println(data);
			} catch (DataInvalidaException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
	}
}

