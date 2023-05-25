import java.util.Scanner;

public class Class1 {
	
	public static boolean validarLogin (String user, String password) {
		if (user.equalsIgnoreCase("Luiz") && password.equals("admin")) 
			
			
			return true;
		return false;
			
		
	}
	public static double somarValores(double[] produto) {
		double soma = 0;
		int i;
		for(i=0; i < produto.length; i++) {
			soma += produto[i];
		}
		return soma;
	}
	//primeiro valor do vetor
	
	public static double primeiroElemento(double[] vetor) {
			 return vetor[0];
		}
	
	//numeros impares
	
	public static void numerosImpares(double[] vetor) {
		for (int i=0; i< vetor.length; i++) {
			if (vetor[i] % 2 != 0) {
				System.out.println( "Os numeros impares foram: " + vetor[i]);
			}
		}
		
	}
	//exibir se existe um numero no vetor
	public static boolean exibir (double[] vetor) {
		int i=0;
		double x = 0;
		System.out.println("Digite um numero para verificar dentro do vetor");
		Scanner leitorNum = new Scanner (System.in);
		x = leitorNum.nextDouble();
		for (i=0; i< vetor.length; i++) {
			if (x == vetor[i]) {
				System.out.println("O numero " + x + "foi achado na posicao " + (i+1) + "do vetor");
				return true;
			}
			
		}
		return false;
	
	}
	
	//ordenando o vetor
	
	

	public static void main(String[] args) {
		Scanner leitorNum = new Scanner (System.in);
		Scanner leitorTexto = new Scanner (System.in);
		double produtos[] = new double[5];
		int i;
		
		String usuario,senha;
		System.out.println("Digite seu usuario:");
		usuario = leitorTexto.nextLine(); 
		System.out.println("Digite sua senha:");
		senha = leitorTexto.nextLine();		
		if (validarLogin(usuario, senha)) {
			System.out.println("Bem vindo " + usuario);
		for (i=0; i<5; i++) {
			System.out.println("Digito o valor do: " + (i + 1) + " produto");
			produtos[i] = leitorNum.nextDouble();


		}
		System.out.println("O valor da compra foi: " + somarValores(produtos));
		System.out.println("O primeiro valor foi: " + primeiroElemento(produtos));
		numerosImpares(produtos);
		exibir(produtos);
		}
	
		else {
		System.out.println("Usuario ou senha errado");
		
		}
			
	}

}
