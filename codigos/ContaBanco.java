import java.util.Scanner;
public class ContaBanco {

	public static void main(String[] args) {
		//Scanner
		Scanner sc = new Scanner(System.in);
		
		int saldo = 500;
		
		//numero da agencia
		int agencianumero = 1235;
		
		//texto
		System.out.println("Digite 1 para entrar na conta. 2 para criar conta");
		
		//escolha do usuario com scanner
		int esco = sc.nextInt();
		
		if (esco == 1) {
			
			//digitar o numero da agencia
			System.out.println("Digite sua agencia");
			
			//Numero digitado pelo scanner
			int agencia = sc.nextInt();
			
			//caso saiba o numero da agencia
			if (agencia == agencianumero) {
				System.out.println("Bem vindo");
			}
			else {
				return;
			}
		}
		//Criação da conta
		if (esco == 2) {
			//nome do usuario
			System.out.println("digite seu nome");
			String nome = sc.nextLine();
			
			System.out.println("Olá" + nome);
			
			//senha que o usuario vai colocar
			System.out.println("Agora digite uma senha");
			String senha = sc.next();
			
			//certificação de senha
			System.out.println("Repita a senha");
			if(senha.equals(senha)) {
				System.out.println("Bem vindo");
				System.out.println("Seu numero da agencia é" + agencianumero);
				System.out.println("você tem um saldo de R$" + saldo + "por criar sua conta");	
			}
			
		}
		sc.close();
	}
}
