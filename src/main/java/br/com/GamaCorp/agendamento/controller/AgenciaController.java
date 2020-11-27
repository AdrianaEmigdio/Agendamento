package br.com.GamaCorp.agendamento.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.GamaCorp.agendamento.dao.AgenciaDAO;
import br.com.GamaCorp.agendamento.model.Agencia;

@RestController
@CrossOrigin("*")

public class AgenciaController {

	/* A anotação  Autowired indica que a referencia DAO do tipo AgenciaDAO sera INJETADA 
	 * O que é isso ? Eu programador vou delegar a busca e instanciação de algum objeto 
	 * que implemente esta interface para a maquina virtual.
	 * 
	 * 
	 */
		
	@Autowired
	private AgenciaDAO dao;
	@GetMapping("/agencias")
	public ArrayList<Agencia> recupararTodas(){
		ArrayList<Agencia> lista; // declarei a lista 
	//	lista = (ArrayList <Agencia>) dao.findAll(); // recuperei os registros do banco e armazena na lista 
		lista = dao.findAllByOrderByNome();
		return lista; // retorno os dados
		
	}
	
}
