package exercicio4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

		public static void main(String[] args){
			int saldoFinal = 0;
			Scanner input = new Scanner(System.in);
			System.out.println("Valor Entrada: ");
			String entrada = input.nextLine();
			Pattern sequencia = Pattern.compile("[0-9]+");
			Matcher combinacao = sequencia.matcher(entrada);
			
			while(combinacao.find()){
				saldoFinal += Integer.parseInt(combinacao.group());
			}
			
			System.out.println("Valor Saida: "+ saldoFinal );			
		}
	}
