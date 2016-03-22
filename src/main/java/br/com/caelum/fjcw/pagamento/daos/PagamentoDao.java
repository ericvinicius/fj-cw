package br.com.caelum.fjcw.pagamento.daos;

import javax.persistence.EntityManager;

import br.com.caelum.fjcw.pagamento.models.Pagamento;
import br.com.caelum.vraptor.ioc.Component;

@Component
public class PagamentoDao {

	private EntityManager session;

	public PagamentoDao(EntityManager session) {
		this.session = session;
	}

	public void salva(Pagamento pagamento){
		session.persist(pagamento);
	}
}
