package br.com.Agenda.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.Agenda.entities.People;
import br.com.Agenda.entities.Phone;
import br.com.Agenda.repositories.RepositoryPeople;
import br.com.Agenda.repositories.RepositoryPhone;


@Service
public class ServicePeople {
		@Autowired
		RepositoryPeople repositoryPeople;
		
		@Autowired
		RepositoryPhone repositoryPhone;
		
		
		
		public List<People> readPeople(){
				return (List<People>) repositoryPeople.findAll();
		}
		
		public List<People> readPeopleByName(String firstName){
			return repositoryPeople.findPeopleByFirstName(firstName);
	}

		public void insertPeople(People people ) {
			people = repositoryPeople.saveAndFlush(people);
			for (Phone phone : people.getListPhones()) {
				phone.setPeople(people);
			}
			repositoryPhone.saveAll(people.getListPhones());
			
		}
		
		public void deletePeople (People people ) {
				repositoryPeople.delete( people);
		}
		
		
		
		public void deletePeopleById (Long id ) {
			repositoryPeople.deleteById(id);
	}
		
		
		
		public void updatePeople (People people) {
			repositoryPeople.save(people);
		}

			
		
}

