package br.com.Agenda.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.Agenda.entities.People;


@Repository
public interface RepositoryPeople extends CrudRepository< People, Long>  {

	void deleteById(int id);
	List<People> findPeopleByFirstName(String firstName);
	People saveAndFlush(People people); 
	
}
