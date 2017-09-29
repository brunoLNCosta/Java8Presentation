package aula01;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import aula01.model.Pessoa;

public class AplicacaoPratica04 {

	public List<Pessoa> pessoas = new ArrayList<>();
	
	public AplicacaoPratica04() {
		pessoas.add(new Pessoa(1l, 27, "João"));
		pessoas.add(new Pessoa(2l, 20, "Maria"));
		pessoas.add(new Pessoa(3l, 50, "Pedro"));
		pessoas.add(new Pessoa(4l, 65, "Guilherme"));
		pessoas.add(new Pessoa(4l, 100, "José"));
		pessoas.add(new Pessoa(4l, 30, "Bruno"));
	}
	
	public void aplicandoLambda() throws Exception {
		
		// Fitrar pessoas com mais de 60 anos.
		List<Pessoa> pessoasAntigas = pessoas.stream()
											 .filter(p -> p.getIdade() > 60)
											 .collect(Collectors.toList());
		
		// Imprimir nome e idade de todos
		pessoas.forEach(p -> System.out.println("Nome: " + p.getNome() + " Idade: " + p.getIdade()));
		
		// Recuperar Bruno
		Optional<Pessoa> bruno = pessoas.stream()
										.filter(p -> p.getNome().equals("Bruno"))
										.findFirst();
		
		// Se bruno nao existir lanca exception
		bruno.orElseThrow(() -> new Exception("Bruno não existe!"));
		
		// Criar lista com os nomes de todas as pessoas
		List<String> nomes = pessoas.stream()
							   .map(p -> p.getNome())
							   .collect(Collectors.toList());
			
	}
	
}
