package br.com.estoque.view;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="CalculadoraMB")
@SessionScoped
public class CalculadoraMB implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private long valor1;
	private long valor2;
	
	public CalculadoraMB() {
		// TODO Auto-generated constructor stub
		valor1 = new Long(0);
		valor2 = new Long(0);
	}
	
	private long resultado;
	
	public void somar(){
		resultado = valor1+valor2;
	}
	
}
