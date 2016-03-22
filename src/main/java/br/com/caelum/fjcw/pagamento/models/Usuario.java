package br.com.caelum.fjcw.pagamento.models;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message="o nome nao pode ser nulo")
	private final String nome;

	@NotEmpty(message="o email nao pode ser nulo")
	private final String email;
	private String endereco;
	private String cpf;
	private Calendar dataNascimento;
	
	protected Usuario(){
		this(null, null);
	}
	
	public Usuario(String nome, String email) {
		this.nome = nome;
		this.email = email;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getNome() {
		return nome;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", email=" + email + "]";
	}
	
	
}
