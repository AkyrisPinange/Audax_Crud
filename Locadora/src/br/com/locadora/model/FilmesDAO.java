package br.com.locadora.model;

import java.util.ArrayList;
import java.util.List;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FilmesDAO {
	

	public static List<Filmes> ListaFilme()
	{
		Connection conn = Conexao.open();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		List<Filmes> lista = null;
		
		try {
		    ps = conn.prepareStatement("select id,titulo,datalancamento,sinopse,genero from filme");
		    rs = ps.executeQuery();
		    lista = new ArrayList<>();
		    while(rs.next()) {
		     lista.add(new Filmes(rs.getInt("id"), 
    				   rs.getString("titulo"), 
    				   rs.getString("datalancamento"), 
    				   rs.getString("sinopse"), 
    				   rs.getString("genero")
    				   ));
		    }
		} catch (SQLException ex) {
		} 
	 Conexao.close(rs, ps, conn);   
		 return lista;
	}
	
	public static void AddFilme(Filmes filme)
	{
		Connection conn = Conexao.open();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
		    ps = conn.prepareStatement("insert into filme(titulo,datalancamento,sinopse,genero) values ('"+filme.getTitulo()+"','"+filme.getDatalancamento()+"','"+filme.getSinopse()+"','"+filme.getGenero()+"')");
		    ps.execute();
		    
		} catch (SQLException ex) {
		} 
	 Conexao.close(conn);   
	
	}
	public static void DeletaFilme(int id)
	{
		Connection conn = Conexao.open();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
		    ps = conn.prepareStatement("delete from filme where id= "+id+ "");
		  
		    ps.execute();
		    
		} catch (SQLException ex) {
		} 
	 Conexao.close(conn);   
	
	}
	
	public static void updateFilme(Filmes filme)
	{
		Connection conn = Conexao.open();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		try {
		    ps = conn.prepareStatement("update filme set titulo = '"+filme.getTitulo()+"',datalancamento ='"+filme.getDatalancamento()+"' ,sinopse = '"+filme.getSinopse()+"',genero = '"+filme.getGenero()+"' where id="+filme.getId());
		    ps.execute();
		    
		} catch (SQLException ex) {
		} 
	 Conexao.close(conn);   
	
	}
	
	public static Filmes ConsultaFilme(int id)
	{
		Connection conn = Conexao.open();
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		List<Filmes> lista = null;
		
		try {
		    ps = conn.prepareStatement("select id,titulo,datalancamento,sinopse,genero from filme where id = "+ id);
		    rs = ps.executeQuery();
		    Filmes f  = null;
		    while(rs.next()) {
		      f =  new Filmes(rs.getInt("id"), 
    				   rs.getString("titulo"), 
    				   rs.getString("datalancamento"), 
    				   rs.getString("sinopse"), 
    				   rs.getString("genero")
    				   );
		     
		    }
		    return f;
		} catch (SQLException ex) {
		} 
	 Conexao.close(rs, ps, conn);   
		 return null;
	}


	
}