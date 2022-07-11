package com.bank.banklineapi.dto;

import com.bank.banklineapi.model.MovimentacaoTipo;
import lombok.*;

@Getter @Setter
public class NovaMovimentacao {

	private String descricao;
	private Double valor;
	private MovimentacaoTipo tipo;
	private int idConta;
	
}