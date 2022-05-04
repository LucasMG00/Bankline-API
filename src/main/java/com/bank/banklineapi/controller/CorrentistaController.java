package com.bank.banklineapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.bank.banklineapi.model.Correntista;
import com.bank.banklineapi.repository.CorrentistaRepository;

import java.util.*;

@RestController
@RequestMapping("/correntistas")
public class CorrentistaController {

	@Autowired
	private CorrentistaRepository repository;
	
	@GetMapping
	public List<Correntista> findAll(){
		
		return repository.findAll();
		
	}
	
}
