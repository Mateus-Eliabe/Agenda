package Agenda;

public class Pessoa {
	
	private String nome;
	private String telefone;
	private int matricula;
	private String email;
	private String endereco;
	private String bairro;
	private String cidade;
	private String uf;
	private int cep;
	
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public Pessoa () {
		
	}
	
	public  Pessoa(String nome, String telefone, int matricula, 
			String bairro, String endereço, String email, String cidade, int cep, String uf) {
		this.nome = nome;
		this.telefone = telefone;
		this.matricula = matricula;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.email = email;
		this.endereco = endereço;
		this.uf = uf;
		
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public int getMatricula() {
		return matricula;
	}
	
	public void setMatricula(int i) {
		this.matricula = i;
  }

	
}