package br.com.Agenda.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.Agenda.entities.TypePhone;
import br.com.Agenda.repositories.RepositoryTypePhone;

@Service
public class ServiceTypePhone {
	
		@Autowired
		RepositoryTypePhone  repositoryTypePhone;
		
		public List<TypePhone> readTypePhone( ){
			return (List<TypePhone>) repositoryTypePhone.findAll( );
		}

}
