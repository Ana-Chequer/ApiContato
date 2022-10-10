package br.com.ana.operacoescrud.repository;

import br.com.ana.operacoescrud.domain.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {
	
}
	
	
	
