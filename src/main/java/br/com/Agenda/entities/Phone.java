package br.com.Agenda.entities;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity(name = "telefone")
public class Phone {
	
	@Id
	@Column( name = "idTelefone")
	@GeneratedValue
	private int id;
	
	@Column( name = "codPaisTelefone")
	private String codCountry;
	
	@Column( name = "codAreaTelefone")
	private String codArea;
	
	@Column( name = "numTelefone")
	private String numPhone;

	@ManyToOne
	@JoinColumn(name ="pessoa_id_pessoa", referencedColumnName = "IdPessoa")
	@JsonBackReference
	private People people;
	
	
	@OneToOne
	@JoinColumn(name = "tipo_telefone_id_tipo_telefone" )
	private TypePhone TypePhone;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCodCountry() {
		return codCountry;
	}

	public void setCodCountry(String codCountry) {
		this.codCountry = codCountry;
	}

	public String getCodArea() {
		return codArea;
	}

	public void setCodArea(String codArea) {
		this.codArea = codArea;
	}

	public String getNumPhone() {
		return numPhone;
	}

	public void setNumPhone(String numPhone) {
		this.numPhone = numPhone;
	}

	public TypePhone getTypePhone() {
		return TypePhone;
	}

	public void setTypePhone(TypePhone typePhone) {
		TypePhone = typePhone;
	}

	public void setPeople(People people2) {
		// TODO Auto-generated method stub
		
	}
		
	
	
}
