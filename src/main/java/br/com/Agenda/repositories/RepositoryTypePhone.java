package br.com.Agenda.repositories;

//import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import br.com.Agenda.entities.TypePhone;

@Repository
public interface RepositoryTypePhone  extends CrudRepository<TypePhone, Long>{	

}
