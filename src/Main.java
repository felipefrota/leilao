import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String pessoa, pessoa2, pessoa3, pessoa4, pessoa5, pessoaMaiorLance = null;
		double lance, lance2, lance3, lance4, lance5, resultado ,maiorLance = 0.0;
		String lote;
		
		System.out.printf("Digite o nome do produto: ");
		lote = sc.nextLine();
		
		System.out.println("Digite o nome do candidato 1: ");
		pessoa = sc.nextLine();
		System.out.println("Digite o nome do candidato 2: ");
		pessoa2 = sc.nextLine();
		System.out.println("Digite o nome do candidato 3: ");
		pessoa3 = sc.nextLine();
		System.out.println("Digite o nome do candidato 4: ");
		pessoa4 = sc.nextLine();
		System.out.println("Digite o nome do candidato 5: ");
		pessoa5 = sc.nextLine();
		
		System.out.printf("Os candidatos inscritos foram %s, %s, %s, %s, %s", pessoa, pessoa2, pessoa3, pessoa4, pessoa5);
		System.out.println("");
		System.out.println("");
		
		for (int i = 0; i < 5; i++) {
			
					System.out.printf("%s, digite seu lance: ", pessoa);
					lance = sc.nextDouble();
					if (maiorLance < lance) {
						maiorLance = lance;
						pessoaMaiorLance = pessoa;
					}
				
					System.out.printf("%s, digite seu lance: ", pessoa2);
					lance2 = sc.nextDouble();
				
					if (maiorLance < lance2){
						maiorLance = lance2;
						pessoaMaiorLance = pessoa2;
					}
					System.out.printf("%s, digite seu lance: ", pessoa3);
					lance3 = sc.nextDouble();
					if (maiorLance < lance3){
						maiorLance = lance3;
						pessoaMaiorLance = pessoa3;
					}
				
					System.out.printf("%s, digite seu lance: ", pessoa4);
					lance4 = sc.nextDouble();
					if (maiorLance < lance4){
						maiorLance = lance4;
						pessoaMaiorLance = pessoa4;
					}
				
					System.out.printf("%s, digite seu lance: ", pessoa5);
					lance5 = sc.nextDouble();
					if (maiorLance < lance5){
						maiorLance = lance5;
						pessoaMaiorLance = pessoa5;
					}
					
					System.out.println("");
					System.out.println("Nova rodada...");
					System.out.println("");
				

		}
		
		
		System.out.printf("O maior lance foi de %.2f e quem mandou ele foi %s", maiorLance, pessoaMaiorLance);

		
		
		sc.close();
		
	}

}
