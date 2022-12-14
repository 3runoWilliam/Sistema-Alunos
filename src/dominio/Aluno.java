package dominio;

public class Aluno {
	
	private String nome;
	private int matricula;
	private float nota1;
	private float nota2;
	private float nota3;
	private float media;
	private String situação;
	
	//Questão pede um construtor vazio
	public Aluno() {	
	}
	
	//Variaveis iniciadas dentro dos metodos	
	public void setNome(String novoNome) {
		this.nome = novoNome;
	}
	public void setMatricula(int novaMatricula) {
		this.matricula = novaMatricula;
	}
	public void setNotas(float n1, float n2, float n3) {
		
		this.nota1 = n1;
		this.nota2 = n2;
		this.nota3 = n3;
	}
	public void calcularMedia() {
		
		this.media = this.nota1 + this.nota2 + this.nota3 / 3;
		
	}
	public boolean buscarAluno(int matricula) {
		
		if(this.matricula == matricula) {
			
			return true;
			
		}else {
			
			return false;
			
		}
	}

	public String getNome() {
		return nome;
	}

	public float getNota1() {
		return nota1;
	}

	public float getNota2() {
		return nota2;
	}

	public float getNota3() {
		return nota3;
	}

	public int getMatricula() {
		return matricula;
	}

	public float getMedia() {
		return media;
	}

	public String getSituação() {
		
		if(this.media >= 7) {
			this.situação = "APROVADO";
		}if(this.media < 7 && this.media > 5) {
			this.situação = "PASSOU POR NOTA";
		}if(this.media < 5) {
			this.situação = "REPROVOU";
		}
		return this.situação;
	}
	public String alterarNota(int codNota, float valorNota) {
		if(codNota == nota1) {
			this.nota1 = valorNota;
		}if(codNota == nota2) {
			this.nota2 = valorNota;
		}if(codNota == nota3) {
			this.nota3 = valorNota;
		}
		return "Alterado com sucesso!!!";
	}

}
