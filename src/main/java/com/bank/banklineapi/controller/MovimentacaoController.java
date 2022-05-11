package com.bank.banklineapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bank.banklineapi.dto.NovaMovimentacao;
import com.bank.banklineapi.model.Movimentacao;
import com.bank.banklineapi.repository.MovimentacaoRepository;
import com.bank.banklineapi.service.MovimentacaoService;

import java.util.*;

@RestController
@RequestMapping("/movimentacoes")
public class MovimentacaoController {

	@Autowired
	private MovimentacaoRepository repository;
	
	@Autowired
	private MovimentacaoService service;
	
	@GetMapping
	public List<Movimentacao> findAll(){
		
		return repository.findAll();
		
	}
	
	@PostMapping
	public void save(@RequestBody NovaMovimentacao movimentacao) {
		
		service.save(movimentacao);
		
	}
	
	@GetMapping("/{idConta}")
	public List<Movimentacao> findAll(@PathVariable("idConta") Integer idConta){
		return repository.findByIdConta(idConta);
	}
	
}
