package br.com.estoque.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="TBL_SOLICITACAO")
@SequenceGenerator(name="SEQ_SOLICITACAO",sequenceName="SEQ_SOLICITACAO")
public class SolicitacaoCompras implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator="SEQ_SOLICITACAO")
	@Column(name="CD_SOLICITACAO")
	private Long cdSolicitacao;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="CD_ESTOQUE")
	private Estoque estoque;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@Fetch(FetchMode.SELECT)
	@JoinColumn(name="PRODUTOS")
	private List<Produto> produtos;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="CD_FORNECEDOR")
	private Fornecedor fornecedor;

	public Long getCdSolicitacao() {
		return cdSolicitacao;
	}

	public void setCdSolicitacao(Long cdSolicitacao) {
		this.cdSolicitacao = cdSolicitacao;
	}

	public Estoque getEstoque() {
		return estoque;
	}

	public void setEstoque(Estoque estoque) {
		this.estoque = estoque;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	public Fornecedor getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	

}
