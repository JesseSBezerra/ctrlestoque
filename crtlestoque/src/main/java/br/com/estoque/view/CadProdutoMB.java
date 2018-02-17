package br.com.estoque.view;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.estoque.model.Produto;
import br.com.infraestrura.hibernate.Dao;
import br.com.infraestrura.hibernate.DaoImp;

@ManagedBean(name="CadProdutoMB")
@SessionScoped
public class CadProdutoMB implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Produto produto;
	
	public CadProdutoMB() {
		// TODO Auto-generated constructor stub
		produto = new Produto();
	}
	
	public void salvar(){
		Dao<Produto> dao = new DaoImp<Produto>(Produto.class);
		dao.salvar(produto);
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	
	
}
