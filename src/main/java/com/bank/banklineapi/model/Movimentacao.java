package com.bank.banklineapi.model;

import java.time.LocalDateTime;
import javax.persistence.*;

@Entity
@Table(name = "tab_movimentacao")
public class Movimentacao {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    
	@Column(name = "data_hora")
    private LocalDateTime dataHora;  
	
	@Column(name = "id_conta")
	private int idConta;
	
    private String descricao;
    
    private Double valor;
    
    @Enumerated(EnumType.STRING)
    private MovimentacaoTipo tipo;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public int getIdConta() {
		return idConta;
	}

	public void setIdConta(int idConta) {
		this.idConta = idConta;
	}

	public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public MovimentacaoTipo getTipo() {
        return tipo;
    }

    public void setTipo(MovimentacaoTipo tipo) {
        this.tipo = tipo;
    }
    
    
    
}
