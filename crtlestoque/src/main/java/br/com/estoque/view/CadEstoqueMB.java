package br.com.estoque.view;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.estoque.model.Estoque;
import br.com.infraestrura.hibernate.Dao;
import br.com.infraestrura.hibernate.DaoImp;

@ManagedBean(name="CadEstoqueMB")
@SessionScoped
public class CadEstoqueMB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Estoque estoque;
	private Dao<Estoque> dao;
	
	public CadEstoqueMB() {
		// TODO Auto-generated constructor stub
		this.estoque = new Estoque();
	}
	
	public void salve(){
		dao = new DaoImp<Estoque>(Estoque.class);
		if(estoque!=null){
			dao.salvar(estoque);
		}
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}
	
	

}
