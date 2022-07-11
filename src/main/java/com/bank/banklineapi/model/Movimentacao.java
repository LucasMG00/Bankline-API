package com.bank.banklineapi.model;

import java.time.LocalDateTime;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.*;

@Getter @Setter
@Entity
@Table(name = "tab_movimentacao")
public class Movimentacao {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@Column(name = "data_hora")
	private LocalDateTime dataHora;  
	
	@Column(name = "id_conta")
	private int idConta;
	
	private String descricao;
    
	private Double valor;
    
    @Enumerated(EnumType.STRING)
    private MovimentacaoTipo tipo;

}