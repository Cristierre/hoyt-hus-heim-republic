package br.com.hoythusheim.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import java.util.Date;

@Entity
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContabilidadeModel {

    public ContabilidadeModel() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @NotEmpty
    private String emissor;

    @NotEmpty
    private Double valor;

    private Date diaRecebimento;
    private Date diaVencimento;
    private Date diaPagamento;
    private String statusConta;


}
