package br.com.hoythusheim.repository;

import br.com.hoythusheim.models.ContabilidadeModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ContabilidadeRepository extends JpaRepository<ContabilidadeModel, Long> {

    List<ContabilidadeModel> findContabilidadeModelByEmissor(String emissor);
    ContabilidadeModel findContabilidadeModelById(Long id);

}