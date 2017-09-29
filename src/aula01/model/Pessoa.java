package aula01.model;

public class Pessoa {

	private Long id;
	
	private Integer idade;
	
	private String nome;
	
	public Pessoa(Long id, Integer idade, String nome) {
		super();
		this.id = id;
		this.idade = idade;
		this.nome = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
