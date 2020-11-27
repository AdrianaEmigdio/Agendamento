package br.com.GamaCorp.agendamento.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.GamaCorp.agendamento.model.Usuario;

public interface UsuarioDao extends CrudRepository<Usuario,Integer>{

	//metodo que busca pelo email e senha  
	public Usuario findByEmailAndSenha(String email, String senha);
	
	//metodo que busca pelo email ou pelo racf 
	public Usuario findByEmailOrRacf(String email, String racf);
}
