package com.bank.banklineapi.model;

import java.time.LocalDateTime;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.*;

@Entity
@Table(name = "tab_movimentacao")
public class Movimentacao {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter private int id;
    
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "data_hora")
	@Getter @Setter private LocalDateTime dataHora;  
	
	@Column(name = "id_conta")
	@Getter @Setter private int idConta;
	
	@Getter @Setter private String descricao;
    
	@Getter @Setter private Double valor;
    
    @Enumerated(EnumType.STRING)
    @Getter @Setter private MovimentacaoTipo tipo;

}