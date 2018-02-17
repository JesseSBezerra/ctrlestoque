package br.com.estoque.view;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.estoque.model.Fornecedor;
import br.com.infraestrura.hibernate.Dao;
import br.com.infraestrura.hibernate.DaoImp;

@ManagedBean
@SessionScoped
public class CadFornecedorMB {

	private Fornecedor fornecedor;
	private Dao<Fornecedor> dao;
	public CadFornecedorMB() {
		// TODO Auto-generated constructor stub
		this.fornecedor = new Fornecedor();
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	public void salvar(){
	this.dao = new DaoImp<>(Fornecedor.class);
		if(!fornecedor.isNull()){
			dao.salvar(fornecedor);
		}
	}
	
	
	
	
}
