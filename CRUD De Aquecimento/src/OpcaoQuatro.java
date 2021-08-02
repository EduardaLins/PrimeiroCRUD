import java.util.Scanner;

public class OpcaoQuatro {
	
public static void execucao(Scanner leitor, CentralDeInformacoes central) {
		
		System.out.print("Digite o nome do servišo:");
		String nomeSer = leitor.nextLine();
		System.out.print("Descreva o servišo:");
		String des = leitor.nextLine();
		boolean tr = true;
		
		for(int i = 0; i < central.getServišos().size(); i++) {
			if(central.getServišos().get(i).getNome().equals(nomeSer)) {
				tr = false;
			}
		}
		if(tr == true) {
			while (true) {
				try {
					System.out.print("Quantos minutos para concluir esse servišo:");
					int duracao = Integer.parseInt(leitor.nextLine());
					Servico s = new Servico(nomeSer, des, duracao);
					central.adicionarServišo(s);
					System.out.println("Servišo salvo\r\n");
					break;
				} catch (RuntimeException e) {
					System.out.println("Ops sˇ pode apenas numeros");
				}
			}
		}
		else {
			System.out.println("Servišo existente");
		}
		
		
	}

}
