
import java.util.Date;

public class Pessoa {
	
	private String nome;
	
	private String Sobrenome;
	
	private int idade;
	
	private Date dataNascimento;
	
	private Date dataNascimento2;
	

	public Date getDataNascimento2() {
		return dataNascimento2;
	}

	public void setDataNascimento2(Date dataNascimento2) {
		this.dataNascimento2 = dataNascimento2;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return Sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}
	
	
}

