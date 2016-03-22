package br.com.caelum.fjcw.pagamento.daos;

import javax.persistence.EntityManager;

import br.com.caelum.fjcw.pagamento.models.Usuario;
import br.com.caelum.vraptor.ioc.Component;

@Component
public class UsuarioDao {

	private EntityManager manager;

	public UsuarioDao(EntityManager manager) {
		this.manager = manager;
	}
	
	public void salva(Usuario u){
		manager.persist(u);
	}
}
