package com.bank.banklineapi.model;

import javax.persistence.*;

import lombok.*;

@Entity
@Table(name = "tab_correntista")
public class Correntista {
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter private int id;
	
	@Column(length = 20)
	@Getter @Setter private String cpf;
	
	@Column(length = 60)
	@Getter @Setter private String nome;

	@Embedded
	@Getter @Setter private Conta conta;
    
}