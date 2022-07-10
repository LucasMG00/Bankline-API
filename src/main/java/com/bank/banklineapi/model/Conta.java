package com.bank.banklineapi.model;

import javax.persistence.*;

import lombok.*;

@Embeddable
public class Conta {
    
	@Column(name = "conta_numero")
	@Getter @Setter private Long numero;
	
	@Column(name = "conta_saldo")
	@Getter @Setter private Double saldo;

}