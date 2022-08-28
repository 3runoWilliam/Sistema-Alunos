package visao;
import dominio.Aluno;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno();
		Aluno a2 = new Aluno();
		Aluno a3 = new Aluno();
		
		Scanner n = new Scanner(System.in);
		
		int opc;
	
		do {
			System.out.println("\n");
			System.out.println("1 - CADASTRAR ALUNOS");
			System.out.println("2 - CADASTRAR NOTAS");
			System.out.println("3 - CALCULAR MÉDIAS");
			System.out.println("4 - INFORMAR SITUAÇÃO");
			System.out.println("5 - INFORMAR DADOS DE UM ALUNO");
			System.out.println("6 - ALTERAR NOTA");
			System.out.println("7 - SAIR");
			System.out.println("\n");
			
			opc = n.nextInt();
			
			switch(opc) {
			case 1:
				System.out.println("DIGITE SUA MATRICULA: ");
				a1.setMatricula(n.nextInt());
				n.nextLine();
				
				System.out.println("DIGITE O NOME DO ALUNO 1: ");
				a1.setNome(n.nextLine()); // pode dar b.o
				
				
				System.out.println("DIGITE SUA MATRICULA: ");
				a2.setMatricula(n.nextInt());
				n.nextLine();
				
				System.out.println("DIGITE O NOME DO ALUNO 2: ");
				a2.setNome(n.nextLine());
				
				System.out.println("DIGITE SUA MATRICULA: ");
				a3.setMatricula(n.nextInt());
				n.nextLine();
				
				System.out.println("DIGITE O NOME DO ALUNO 3: ");
				a3.setNome(n.nextLine());
				
				break;
			case 2:
				float n1, n2, n3;
				System.out.println("\tALUNO 1");
				System.out.println("DIGITE NOTA 1: ");
				n1 = n.nextFloat();
				System.out.println("DIGITE NOTA 2: ");
				n2 = n.nextFloat();
				System.out.println("DIGITE NOTA 3: ");
				n3 = n.nextFloat();
				a1.setNotas(n1, n2, n3);
				
				System.out.println("\tALUNO 1");
				System.out.println("DIGITE NOTA 1: ");
				n1 = n.nextFloat();
				System.out.println("DIGITE NOTA 2: ");
				n2 = n.nextFloat();
				System.out.println("DIGITE NOTA 3: ");
				n3 = n.nextFloat();
				a2.setNotas(n1, n2, n3);
				
				System.out.println("\tALUNO 1");
				System.out.println("DIGITE NOTA 1: ");
				n1 = n.nextFloat();
				System.out.println("DIGITE NOTA 2: ");
				n2 = n.nextFloat();
				System.out.println("DIGITE NOTA 3: ");
				n3 = n.nextFloat();
				a3.setNotas(n1, n2, n3);
				break;
			case 3:
				
				a1.getMedia();	
				a2.getMedia();	
				a3.getMedia();	
				
				break;
				
			case 4:
				System.out.println("\n" + a1.getSituação() + "\n" + a2.getSituação() + "\n" + a3.getSituação());
				break;
				
			case 5:
				int aux;
				System.out.println("DIGITE O RESPECTIVO ALUNO: \n" + "1 - " + a1.getNome() + "\n2 - " + a2.getNome() + "\n3 - " + a3.getNome());
				aux = n.nextInt();
				
				if(aux == 1) {
					System.out.println("NOME: " + a1.getNome() + "\n" + "MATRICULA: " + a1.getMatricula() + "\n" + "MEDIA: " + a1.getMedia() + "\n" + "SITUAÇÃO: " + a1.getSituação());
				}if(aux == 2) {
					System.out.println("NOME: " + a2.getNome() + "\n" + "MATRICULA: " + a2.getMatricula() + "\n" + "MEDIA: " + a2.getMedia() + "\n" + "SITUAÇÃO: " + a2.getSituação());
				}if(aux == 3) {
					System.out.println("NOME: " + a3.getNome() + "\n" + "MATRICULA: " + a3.getMatricula() + "\n" + "MEDIA: " + a3.getMedia() + "\n" + "SITUAÇÃO: " + a3.getSituação());
				}
				
				break;
			case 6:
				
				int aluno, cod;
				float nota;
					System.out.println("voce escolheu 'alterar nota'");
					System.out.println("qual aluno voce deseja mudar a nota ");
					aluno = n.nextInt();
				if(aluno == 1) {
					System.out.println("qual nota voce deseja mudar [1/2/3]");
					cod = n.nextInt();
					System.out.println("qual o valor novo da nota ");
					nota = n.nextFloat();
					a1.alterarNota(cod, nota);
				}else {
					if(aluno == 2) {
						System.out.println("qual nota voce deseja mudar [1/2/3]");
						cod = n.nextInt();
						System.out.println("qual o valor novo da nota ");
						nota = n.nextFloat();
						a2.alterarNota(cod, nota);
					}else {
						if(aluno == 3) {
							System.out.println("qual nota voce deseja mudar [1/2/3]");
							cod = n.nextInt();
							System.out.println("qual o valor novo da nota ");
							nota = n.nextFloat();
							a3.alterarNota(cod, nota);
						}
					}
				}
				
				break;
				
			}
				

		}while(opc != 7);
		
		System.out.println("VC SAIU!!!");

	}

}
