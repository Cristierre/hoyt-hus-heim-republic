package br.com.hoythusheim.repository;

import br.com.hoythusheim.models.ContaModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ContaRepository extends JpaRepository<ContaModel, Long> {

    List<ContaModel> findContaModelByEmissor(String emissor);
    ContaModel findContaModelById(Long id);

}