package br.com.estoque.teste.solicitacao;


import br.com.estoque.model.Estoque;
import br.com.estoque.model.SolicitacaoCompras;
import br.com.infraestrura.hibernate.Dao;
import br.com.infraestrura.hibernate.DaoImp;

public class CadSolicitacaoTeste {
public static void main(String[] args) {
SolicitacaoCompras solicitacaoCompras = new SolicitacaoCompras();
//solicitacaoCompras.setEstoque(new Estoque(1L,"TESTE","N"));
Dao<SolicitacaoCompras> dao = new DaoImp<>(SolicitacaoCompras.class);
dao.salvar(solicitacaoCompras);
}
}
