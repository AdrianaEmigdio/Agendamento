package br.com.GamaCorp.agendamento.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.GamaCorp.agendamento.model.Agencia;

/* quando declaramos a interface, temos nesta interface uma declaração de que
 * vamos utilizar as operações básicas do CRUD (através da CrudRepository), indicando
 * que este CRUD irá manipular objetos do tipo Agencia
 */

public interface AgenciaDAO extends CrudRepository<Agencia, Integer>{

	public ArrayList<Agencia> findAllByOrderByNome();
}
