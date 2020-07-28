package br.com.locadora.controller;

   
import java.io.Console;
import java.util.ArrayList;
import java.util.List;    
import org.springframework.beans.factory.annotation.Autowired;    
import org.springframework.stereotype.Controller;  
import org.springframework.ui.Model;  
import org.springframework.web.bind.annotation.ModelAttribute;    
import org.springframework.web.bind.annotation.PathVariable;    
import org.springframework.web.bind.annotation.RequestMapping;    
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.locadora.model.Filmes;
import br.com.locadora.model.FilmesDAO;

@Controller
@RequestMapping("/filmes")
public class FilmesController {
	
	  
	  private static final String String = null;
	  /*Classe Responsalvel por receber interação do usuario e disparar comando sql da classe DAO para listar os dados na tela*/
	@RequestMapping(value="/lista",method = RequestMethod.GET)    
	    public ModelAndView Lista(){    
	       
		ModelAndView modelAndView = new ModelAndView("filmes");
		 
		List<Filmes> f = null;
		
		f = FilmesDAO.ListaFilme();
		
		modelAndView.addObject("lista", f);
	 
		 return modelAndView;
	    }    
		
	/*Classe Responsalvel por receber interação do usuario e disparar comando sql da classe DAO e salvar*/
	  @RequestMapping(value="/save",method = RequestMethod.POST)    
	    public ModelAndView save(@ModelAttribute("filme") Filmes filme){    
	       
		  FilmesDAO.AddFilme(filme);  
	        
		  /*redireciona para tela inicial */
	        return Lista();  
	    }    
	
	  @RequestMapping(value="/addFilmes",method = RequestMethod.GET) 
	  public ModelAndView AddFilme(){
	
	  ModelAndView modelAndView = new ModelAndView("addFilmes");
	  modelAndView.addObject("command",new  Filmes());
	  return modelAndView;
	  }
	

		/*Classe Responsalvel por receber interação do usuario e disparar comando sql da classe DAO e Editar*/

	  @RequestMapping(value="/editafilme/{id}",method = RequestMethod.GET) 
	  public ModelAndView EditaFilme(@PathVariable("id") int id){
	
	  ModelAndView modelAndView = new ModelAndView("editafilme");
	  
	  Filmes  f =  FilmesDAO.ConsultaFilme(id);
	  
	  modelAndView.addObject("command", f);
	  return modelAndView;
	  }
	  
	  @RequestMapping(value="/edita",method = RequestMethod.POST)    
	    public ModelAndView edita(@ModelAttribute("filme") Filmes filme){    
	       
		  FilmesDAO.updateFilme(filme);  
	        
		  /*redireciona para tela inicial */
	        return Lista();  
	    }    
	
	 
		
	  
	  
	  @RequestMapping(value="/deletafilme/{id}",method = RequestMethod.GET) 
	  public ModelAndView DeletaFilme(@PathVariable("id") int id){
		  
	  ModelAndView modelAndView = new ModelAndView("deletafilme");
	  
	  Filmes f = new Filmes(id, null, null, null, null);
	  
	  modelAndView.addObject("command",  f);
	  return modelAndView; 
	  
	  }
	  @RequestMapping(value="/deleta",method = RequestMethod.POST)    
	    public ModelAndView Deleta(@ModelAttribute("filme") Filmes filme) {
		  
		  

		 FilmesDAO.DeletaFilme(filme.getId());
		 
		 return Lista();
		 
		  
	  }
	    
	  
	  @RequestMapping(value="/detalhesfilme/{id}",method = RequestMethod.GET) 
	  public ModelAndView DetalhesFilme(@PathVariable("id") int id){
	
	  ModelAndView modelAndView = new ModelAndView("detalhesfilme");
	  
	  Filmes  f =  FilmesDAO.ConsultaFilme(id);
	  
	  List<Filmes> lista = null; 
	  lista = new ArrayList<Filmes>();
	  lista.add(f);
	  
	  modelAndView.addObject("lista", lista);
	  
	  return modelAndView;
	  }
	  
	  @RequestMapping(value="/alugafilme",method = RequestMethod.GET) 
	  public ModelAndView AlugaFilme(){
	
	  ModelAndView modelAndView = new ModelAndView("alugafilme");
	  modelAndView.addObject("command",new  Filmes());
	  return modelAndView;
	  }
	  
	 

}

