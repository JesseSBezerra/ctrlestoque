package br.com.estoque.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="TBL_SERVICO")
@SequenceGenerator(name="SEQ_SERVICO",sequenceName="SEQ_SERVICO")
public class Servico implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
