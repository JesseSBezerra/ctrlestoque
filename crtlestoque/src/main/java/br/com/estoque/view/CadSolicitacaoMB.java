package br.com.estoque.view;

import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.estoque.model.Produto;
import br.com.estoque.model.SolicitacaoCompras;
import br.com.infraestrura.hibernate.Dao;
import br.com.infraestrura.hibernate.DaoImp;

@ManagedBean(name="CadSolicitacaoMB")
@SessionScoped
public class CadSolicitacaoMB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private SolicitacaoCompras solicitacaoCompras;
	private List<Produto> produtos;
	private Dao<SolicitacaoCompras> dao;
	
	public void salvar(){
		dao = new DaoImp<SolicitacaoCompras>(SolicitacaoCompras.class);
		if(solicitacaoCompras!=null){
			dao.salvar(solicitacaoCompras);
		}
	}
	
	public SolicitacaoCompras getSolicitacaoCompras() {
		return solicitacaoCompras;
	}
	public void setSolicitacaoCompras(SolicitacaoCompras solicitacaoCompras) {
		this.solicitacaoCompras = solicitacaoCompras;
	}
	public List<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
	
	
	

}
