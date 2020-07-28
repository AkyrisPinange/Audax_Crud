package br.com.locadora.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public class Login {
	

    private Integer Id;
	
	
	private String Login;
	 
	

	private String Senha;
	 
	 
	 public int getId() {
	        return Id;
	    }
	 
	 public String getLogin() {
	        return Login;
	    }
	 
	 public void setLogin(String _Login) {
	        this.Login = _Login;
	    }
	    
	 public String getSenha() {
		        return Senha;
		    }
		 
	 public void setSenha(String _Senha) {
		        this.Senha = _Senha;
		    }
	
	

}
