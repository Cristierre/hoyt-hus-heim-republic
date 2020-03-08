package br.com.hoythusheim.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
public class ContaModel {

    public ContaModel() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;


    private String emissor;

    private BigDecimal valor;

    private Date diaRecebimento;
    private Date diaVencimento;
    private Date diaPagamento;
    private String statusConta;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
