package com.bank.banklineapi.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.banklineapi.dto.NovaMovimentacao;
import com.bank.banklineapi.model.Correntista;
import com.bank.banklineapi.model.Movimentacao;
import com.bank.banklineapi.model.MovimentacaoTipo;
import com.bank.banklineapi.repository.CorrentistaRepository;
import com.bank.banklineapi.repository.MovimentacaoRepository;

@Service
public class MovimentacaoService {
	
	@Autowired
	private MovimentacaoRepository repository;
	
	@Autowired
	private CorrentistaRepository correntistaRepository;
	
	public void save(NovaMovimentacao novaMovimentacao) {
		
		Movimentacao movimentacao = new Movimentacao();
		
		Double valor = novaMovimentacao.getTipo()==MovimentacaoTipo.RECEITA ?
					   novaMovimentacao.getValor() : novaMovimentacao.getValor() * -1;
		
		movimentacao.setDataHora(LocalDateTime.now());
		movimentacao.setDescricao(novaMovimentacao.getDescricao());
		movimentacao.setIdConta(novaMovimentacao.getIdConta());
		movimentacao.setTipo(novaMovimentacao.getTipo());
		movimentacao.setValor(valor);
		
		Correntista correntista = correntistaRepository.findById(novaMovimentacao.getIdConta()).orElse(null);
		
		if(correntista != null) {
			
			correntista.getConta().setSaldo(correntista.getConta().getSaldo() + valor);
			correntistaRepository.save(correntista);
			
		}
		repository.save(movimentacao);
		
	}

}
