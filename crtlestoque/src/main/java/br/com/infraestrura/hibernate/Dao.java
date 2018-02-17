package br.com.infraestrura.hibernate;


import java.util.List;

public interface Dao<T> {
	
	public void salvar(T t);
	public T buscar(Long t);
	public List<T> listar();

}
