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
@Table(name="TB_FORNECEDOR")
@SequenceGenerator(name = "SEQ_FORNECEDOR", sequenceName = "SEQ_FORNECEDOR")
public class Fornecedor implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "SEQ_FORNECEDOR")
	@Column(name = "CD_FORNECEDOR")
	private Long cdFornecedor;
	
	@Column(name="NM_FORNECEDOR")
	private String nmFornecedor;
	
	@Column(name="CNPJ",unique=true)
	private String cnpj;
	
	@Column(name="DS_EMAIL")
	private String dsEmail;
	
	@Column(name="DS_TELEFONE")
	private String dsTelefone;
	
	@Column(name="TP_ESPECIE")
	private String tpEspecie;

	public Long getCdFornecedor() {
		return cdFornecedor;
	}

	public void setCdFornecedor(Long cdFornecedor) {
		this.cdFornecedor = cdFornecedor;
	}

	public String getNmFornecedor() {
		return nmFornecedor;
	}

	public void setNmFornecedor(String nmFornecedor) {
		this.nmFornecedor = nmFornecedor;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getDsEmail() {
		return dsEmail;
	}

	public void setDsEmail(String dsEmail) {
		this.dsEmail = dsEmail;
	}

	public String getDsTelefone() {
		return dsTelefone;
	}

	public void setDsTelefone(String dsTelefone) {
		this.dsTelefone = dsTelefone;
	}

	public String getTpEspecie() {
		return tpEspecie;
	}

	public void setTpEspecie(String tpEspecie) {
		this.tpEspecie = tpEspecie;
	}
	
	public boolean isNull(){
		if (this==null){
			return true;
		}else{
			return false;
		}
	}
	

}
