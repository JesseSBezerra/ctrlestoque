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
@Table(name="TB_ESTOQUE")
@SequenceGenerator(name="SEQ_ESTOQUE",sequenceName="SEQ_ESTOQUE")
public class Estoque implements Serializable{

	
	public Estoque() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Estoque(Long cdEstoque, String dsEstoque, String snControlaSaldo) {
		super();
		this.cdEstoque = cdEstoque;
		this.dsEstoque = dsEstoque;
		this.snControlaSaldo = snControlaSaldo;
	}



	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_ESTOQUE")
	@Column(name= "CD_ESTOQUE")
	private Long cdEstoque;
	
	@Column(name="DS_ESTOQUE")
	private String dsEstoque;
	
	@Column(name="SN_CONTROLA_SALDO",length=1)
	private String snControlaSaldo;

	public Long getCdEstoque() {
		return cdEstoque;
	}

	public void setCdEstoque(Long cdEstoque) {
		this.cdEstoque = cdEstoque;
	}

	public String getDsEstoque() {
		return dsEstoque;
	}

	public void setDsEstoque(String dsEstoque) {
		this.dsEstoque = dsEstoque;
	}

	public String getSnControlaSaldo() {
		return snControlaSaldo;
	}

	public void setSnControlaSaldo(String snControlaSaldo) {
		this.snControlaSaldo = snControlaSaldo;
	}	
	
}
