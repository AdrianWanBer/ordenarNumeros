package edu.operadores4;
import java.util.Scanner;

public class program{
	

	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	       //Creamos las pedidas de numeros
	        System.out.print("Escribe un numero: ");
	        double numero1 = scanner.nextDouble();

	        System.out.print("Escribe el segundo numeroo: ");
	        double numero2 = scanner.nextDouble();

	        System.out.print("Escribe el tercer numero: ");
	        double numero3 = scanner.nextDouble();
	      
	        //Hacemos los if que comprobaran el orden de los numeros y imprimiran el resultado
	        
	        if (numero1 >= numero2 && numero1 >= numero3) {
	        	
	            if (numero2 >= numero3) {
	                System.out.println("Números ordenados de mayor a menor: " + numero1 + ", " + numero2 + ", " + numero3);
	                
	            } else {
	                
	            	System.out.println("Números ordenados de mayor a menor: " + numero1 + ", " + numero3 + ", " + numero2);
	            	
	            }
	        } else if (numero2 >= numero1 && numero2 >= numero3) {
	        	
	            if (numero1 >= numero3) {
	            	
	                System.out.println("Números ordenados de mayor a menor: " + numero2 + ", " + numero1 + ", " + numero3);
	                
	            } else {
	            	
	                System.out.println("Números ordenados de mayor a menor: " + numero2 + ", " + numero3 + ", " + numero1);
	                
	            }
	        } else {
	        	
	            if (numero1 >= numero2) {
	            	
	                System.out.println("Números ordenados de mayor a menor: " + numero3 + ", " + numero1 + ", " + numero2);
	                
	            } else {
	            	
	                System.out.println("Números ordenados de mayor a menor: " + numero3 + ", " + numero2 + ", " + numero1);
	                
	            }
	        }
	    }
}