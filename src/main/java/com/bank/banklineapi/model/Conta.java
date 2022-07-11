package com.bank.banklineapi.model;

import javax.persistence.*;

import lombok.*;

@Getter @Setter
@Embeddable
public class Conta {
    
	@Column(name = "conta_numero")
	private Long numero;
	
	@Column(name = "conta_saldo")
	private Double saldo;

}