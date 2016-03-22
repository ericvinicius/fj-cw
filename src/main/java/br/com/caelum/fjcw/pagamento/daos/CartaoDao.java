package br.com.caelum.fjcw.pagamento.daos;

import javax.persistence.EntityManager;

import br.com.caelum.fjcw.pagamento.models.Cartao;
import br.com.caelum.vraptor.ioc.Component;

@Component
public class CartaoDao {

	private EntityManager manager;

	public CartaoDao(EntityManager manager) {
		this.manager = manager;
	}
	
	public void salva(Cartao c){
		manager.persist(c);
	}
}
