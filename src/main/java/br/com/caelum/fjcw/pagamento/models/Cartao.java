package br.com.caelum.fjcw.pagamento.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Cartao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message="O numero nao pode ser vazio")
	@Size(min=10, max=10, message="O numero tem que ter 10 caracteres")
	private final String numero;
	
	@NotNull(message="a bandeira nao pode ser nula")
	private final Bandeira bandeira;
	
	@NotNull(message="o cvv nao pode ser nulo")
	@Size(min=3, max=3, message="o cvv tem que ter 3 caracteres")
	private final String cvv;
	
	protected Cartao() {
		this(null, null, null);
	}
	
	public Cartao(String numero, Bandeira bandeira, String cvv) {
		this.numero = numero;
		this.bandeira = bandeira;
		this.cvv = cvv;
	}

	public String getNumero() {
		return numero;
	}
	public Bandeira getBandeira() {
		return bandeira;
	}
	public String getCvv() {
		return cvv;
	}

	@Override
	public String toString() {
		return "Cartao [numero=" + numero + ", bandeira=" + bandeira + ", cvv=" + cvv + "]";
	}
}
