import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o Primeiro número:");
		int n1 = sc.nextInt();
		System.out.println("Digite o Segundo número:");
		int n2 = sc.nextInt();
		
		if(n1%n2==0){
		System.out.println("A Divsão de "+n1+" Por "+n2+" e exata!");
		}
		
		else
		System.out.println("Divsão não é exata!");
		
	}
}


