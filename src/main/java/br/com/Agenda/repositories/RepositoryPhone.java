package br.com.Agenda.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.Agenda.entities.Phone;
@Repository
public interface RepositoryPhone  extends CrudRepository<Phone, Long> {
	
//	@Query(value = "DELETE FROM telefone p where p.pessoa_id_pessoa")
//	
}
