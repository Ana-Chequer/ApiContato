package br.com.ana.operacoescrud.repository;

import br.com.ana.operacoescrud.domain.Contato;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface ContatoRepository extends MongoRepository<Contato, Long> {
	
}
	
	
	
