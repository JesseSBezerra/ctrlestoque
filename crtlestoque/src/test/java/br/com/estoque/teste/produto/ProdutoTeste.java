package br.com.estoque.teste.produto;

import br.com.estoque.model.Produto;
import br.com.infraestrura.hibernate.Dao;
import br.com.infraestrura.hibernate.DaoImp;

public class ProdutoTeste {

	public static void main(String[] args) {
		Dao<Produto> dao = new DaoImp<Produto>(Produto.class);
		
		br.com.estoque.model.Produto produto = new br.com.estoque.model.Produto();
		produto.setDsProduto("Amoxixilina 500MG");
		produto.setSnLote("S");
		produto.setSnValidade("S");
		produto.setTpEspecie("S");
		
		dao.salvar(produto);
	}
	
}
