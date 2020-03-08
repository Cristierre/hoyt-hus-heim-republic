package br.com.hoythusheim.dto;

import lombok.Builder;

import java.util.Date;

@Builder
public class ContaDto {

    private Long id;
    private String emissor;
    private Long valor;
    private Date diaRecebimento;
    private Date diaPagamento;
    private String statusConta;

}
