package com.bank.banklineapi.model;

import javax.persistence.*;

import lombok.*;

@Getter @Setter
@Entity
@Table(name = "tab_correntista")
public class Correntista {
   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 20)
	private String cpf;
	
	@Column(length = 60)
	private String nome;

	@Embedded
	private Conta conta;
    
}