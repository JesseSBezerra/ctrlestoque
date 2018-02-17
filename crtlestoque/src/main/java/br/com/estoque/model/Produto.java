package br.com.estoque.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_PRODUTO")
@SequenceGenerator(name = "SEQ_PRODUTO", sequenceName = "SEQ_PRODUTO")
public class Produto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_PRODUTO")
	@Column(name = "CD_PRODUTO")
	private Long cdProduto;

	@Column(name = "DS_PRODUTO")
	private String dsProduto;

	@Column(name = "SN_LOTE", length = 1)
	private String snLote;

	@Column(name = "SN_VALIDADE", length = 1)
	private String snValidade;

	@Column(name = "TP_ESPECIE",length=1)
	private String tpEspecie;

	public Long getCdProduto() {
		return cdProduto;
	}

	public void setCdProduto(Long cdProduto) {
		this.cdProduto = cdProduto;
	}

	public String getDsProduto() {
		return dsProduto;
	}

	public void setDsProduto(String dsProduto) {
		this.dsProduto = dsProduto;
	}

	public String getSnLote() {
		return snLote;
	}

	public void setSnLote(String snLote) {
		this.snLote = snLote;
	}

	public String getSnValidade() {
		return snValidade;
	}

	public void setSnValidade(String snValidade) {
		this.snValidade = snValidade;
	}

	public String getTpEspecie() {
		return tpEspecie;
	}

	public void setTpEspecie(String tpEspecie) {
		this.tpEspecie = tpEspecie;
	}

	
	
	

}
