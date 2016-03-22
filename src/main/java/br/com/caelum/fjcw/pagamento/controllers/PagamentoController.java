package br.com.caelum.fjcw.pagamento.controllers;

import br.com.caelum.fjcw.pagamento.daos.CartaoDao;
import br.com.caelum.fjcw.pagamento.daos.PagamentoDao;
import br.com.caelum.fjcw.pagamento.daos.UsuarioDao;
import br.com.caelum.fjcw.pagamento.models.Cartao;
import br.com.caelum.fjcw.pagamento.models.Pagamento;
import br.com.caelum.fjcw.pagamento.models.Usuario;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Path;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;

@Resource
public class PagamentoController {

	private PagamentoDao dao;
	private UsuarioDao uDao;
	private CartaoDao cDao;
	private Result result;
	private Validator validator;

	public PagamentoController(PagamentoDao dao, UsuarioDao uDao, CartaoDao cDao, Result result, Validator validator) {
		this.dao = dao;
		this.uDao = uDao;
		this.cDao = cDao;
		this.result = result;
		this.validator = validator;
	}
	
	@Path("/pagamento")
	public void pagamento(){
		result.include("msg", "Message from your controller");
	}
	
	@Post("/efetua")
	public void efetua(Usuario usuario, Cartao cartao){
		validator.validate(cartao);
		validator.onErrorUsePageOf(this).pagamento();
		
		uDao.salva(usuario);
		cDao.salva(cartao);
		dao.salva(new Pagamento(usuario, cartao));
		result.redirectTo(this).sucesso(usuario, cartao);
	}
	
	@Get("/sucesso")
	public void sucesso(Usuario usuario, Cartao cartao){
		System.out.println(usuario);
		System.out.println(cartao);
	}
	
	
}
