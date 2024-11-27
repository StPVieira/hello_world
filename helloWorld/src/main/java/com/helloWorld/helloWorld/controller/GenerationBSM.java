package com.helloWorld.helloWorld.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm")
public class GenerationBSM {
	@GetMapping
	public ArrayList<String> bsmGeneration() {
		ArrayList<String> bsm = new ArrayList<>();
		bsm.addAll(Arrays.asList("Mentalidade de Crescimento", "Persistência", "Orientação ao Futuro", "Responsabilidade Pessoal" 
									+ "Comunicação", "Proatividade", "Orientação ao Detalhe", "Trabalho em Equipe"));
		return bsm;
	}
}
