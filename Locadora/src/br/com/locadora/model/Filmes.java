package br.com.locadora.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class Filmes implements Serializable {
	
	public Filmes(int _id, String _titulo, String _datalancamento, String _sinopse, String _genero ) {
		this.id = _id;
		this.titulo =  _titulo;
		this.sinopse = _sinopse;
		this.genero = _genero;
		this.datalancamento= _datalancamento;
		
	}
	
	public Filmes() {}

	private int id;

	private String titulo;
	
	private String datalancamento;
	
	private String sinopse;
	
	private String genero;
	
	
	 @Override
	    public boolean equals(Object obj) {
	        if (obj == null) {
	            return false;
	        }
	        if (getClass() != obj.getClass()) {
	            return false;
	        }
	        final Filmes other = (Filmes) obj;
	        if (!Objects.equals(this.id, other.id)) {
	            return false;
	        }
	        return true;
	    }
	

	public int getId() {
		return id;
	}
	
	public void setId(int _id)
	{
		this.id = _id;
	}
	

	public String getTitulo() {
		return titulo;
	}
	
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	
	public String getDatalancamento() {
		return datalancamento;
	}
	public void setDatalancamento(String datalancamento) {
		this.datalancamento = datalancamento;
	}

	public String getSinopse() {
		return sinopse;
	}
	public void setSinopse(String sinopse) {
		this.sinopse = sinopse;
	}

	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
		
}
