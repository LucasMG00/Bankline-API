package com.bank.banklineapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bank.banklineapi.dto.NovoCorrentista;
import com.bank.banklineapi.model.Correntista;
import com.bank.banklineapi.repository.CorrentistaRepository;
import com.bank.banklineapi.service.CorrentistaService;

import java.util.*;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {

	@Autowired
	private CorrentistaRepository repository;
	
	@Autowired
	private CorrentistaService service;
	
	@GetMapping
	public List<Correntista> findAll(){
		
		return repository.findAll();
		
	}
	
	@PostMapping
	public void save(@RequestBody NovoCorrentista correntista) {
		
		service.save(correntista);
		
	}
	
}
