package com.victorlobato.departamento.app.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import java.util.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Funcionario extends AbstractEntity<Long> {

    @Column(nullable = false)
    private String nome;
    private String sobrenome;
    @JsonFormat(pattern="yyyy-MM-dd")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    @Column(nullable = false)
    private Date data_entrada;
    @JsonFormat(pattern="yyyy-MM-dd")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private Date data_saida;
}
