package com.bank.banklineapi.dto;

import com.bank.banklineapi.model.MovimentacaoTipo;
import lombok.*;

public class NovaMovimentacao {

	@Getter @Setter private String descricao;
	@Getter @Setter private Double valor;
	@Getter @Setter private MovimentacaoTipo tipo;
	@Getter @Setter private int idConta;
	
}