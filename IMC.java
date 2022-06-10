import java.util.Scanner;
public class Main{
	public static void main(String[] args){
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Digite o Peso:");
		double P1 = Double.parseDouble(sc.nextLine());
		System.out.println("Digite o Altura:");
		double A1 = Double.parseDouble(sc.nextLine());
		double imc = P1/(A1*A1);
		System.out.println(imc);
		if (imc<26){
		System.out.println("Peso normal!");}
		else if (imc>=26 && imc<30){
		System.out.println("Peso Obeso!");}
		else if (imc<=30){
		System.out.println("Peso Obeso Morbido!");}	
	}
}

