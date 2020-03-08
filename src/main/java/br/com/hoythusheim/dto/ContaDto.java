package br.com.hoythusheim.dto;

import lombok.Builder;

import java.math.BigDecimal;
import java.util.Date;

@Builder
public class ContaDto {

    private Long id;
    private String emissor;
    private BigDecimal valor;
    private Date diaRecebimento;
    private Date diaPagamento;
    private String statusConta;

}
