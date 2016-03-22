package br.com.caelum.fjcw.pagamento.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Pagamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	private Usuario usuario;
	
	@OneToOne
	private Cartao cartao;
	
	public Pagamento() {
	}
	
	public Pagamento(Usuario usuario, Cartao cartao) {
		this.usuario = usuario;
		this.cartao = cartao;
	}
	
}
