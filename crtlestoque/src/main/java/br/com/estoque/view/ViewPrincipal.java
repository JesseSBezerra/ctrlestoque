package br.com.estoque.view;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import br.com.estoque.model.Produto;

@ManagedBean
@ViewScoped
public class ViewPrincipal implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Produto produto;
	
	public ViewPrincipal() {
		// TODO Auto-generated constructor stub
		produto = new Produto();
	}
	
	public Produto getProduto(){
		if(produto==null){
			produto = new Produto();
		}
		return produto;
	}
	
	public String exibirProduto(){
		FacesContext context = FacesContext.getCurrentInstance();  
        context.addMessage(null, new FacesMessage(getProduto().toString()));
	  return "Teste";
	}

}
