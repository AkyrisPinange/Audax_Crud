package br.com.locadora.controller;

import br.com.locadora.model.Login;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import antlr.collections.List;

@Controller
@RequestMapping("/sistema")
public class LocadoraController {
 @RequestMapping(value = "/TelaCrudFilmes", method = RequestMethod.GET)
 public ModelAndView boasVindas(@RequestParam(value = "nome", required = false, defaultValue = "Cícero Ednilson") String nome) {

 ModelAndView modelAndView = new ModelAndView("TelaCrudFilmes");
 modelAndView.addObject("mensagem", "Olá " + nome);

 
 return modelAndView;
 }
 

}
