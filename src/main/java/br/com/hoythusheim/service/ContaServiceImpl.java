package br.com.hoythusheim.service;

import br.com.hoythusheim.models.ContaModel;
import br.com.hoythusheim.repository.ContaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class ContaServiceImpl {

    private ContaRepository contaRepository;

    public ContaModel registraConta(ContaModel conta){
        return contaRepository.save(conta);
    }

    public List<ContaModel> listaContas(){
        return contaRepository.findAll();
    }

    public List<ContaModel> buscaPorEmissor(String emissor){
        return contaRepository.findContaModelByEmissor(emissor);
    }

    public ContaModel buscaContaPorId(Long id){
        return contaRepository.findContaModelById(id);
    }

    public void deletaConta(Long id){
        contaRepository.deleteById(id);
    }
}
