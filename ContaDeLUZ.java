import java.util.Scanner;
public class Main
{
    public static void main(String[] args){
	    
		System.out.println("Digite o valor de kwh");
		Scanner input = new Scanner(System.in);
		int kwh = input.nextInt();
		   double consumo = 0;
		   
		  if(kwh >=0 && kwh<150){
		  System.out.println("Consumo baixo");
		  consumo = kwh*0.20;}
		  
		  else if(kwh >=150 && kwh<500){
		  System.out.println("Consumo medio");
		  consumo = kwh*0.25;}
		  
		 else if(kwh > 500){
		     System.out.println("Consumo alto");
		     consumo = kwh*0.30;
		 }
		   if(consumo < 11.90){
        System.out.println("Sua conta sera 11.90");
		   }
        else if (consumo >=11.90){
        System.out.println("Conta R$"+ consumo );
		 }		 
        }
}


