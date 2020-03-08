package br.com.hoythusheim.controller;

import br.com.hoythusheim.dto.ContaDto;
import br.com.hoythusheim.models.ContaModel;
import br.com.hoythusheim.service.ContaServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/contas")
@AllArgsConstructor
public class ContaController {

    private ContaServiceImpl contaService;

    @PostMapping
    public ResponseEntity registraConta(@RequestBody ContaModel conta) throws URISyntaxException {
        ContaModel contaModel = contaService.registraConta(conta);
        return ResponseEntity.created(new URI(String.format("/contas/%d", contaModel.getId()))).build();
    }
}
