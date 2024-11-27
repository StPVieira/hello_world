package com.helloWorld.helloWorld.controller;

import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/objetivos")
public class Objetivos {
	@GetMapping
	public ArrayList<String> objetivos() {
		ArrayList<String> objetivos = new ArrayList<>();
		objetivos.addAll(Arrays.asList("1 - Desenvolver uma aplicação MVP até domingo.", "2 - Estudar typescript",
				"3 - Terminar mais uma semana do CS50", "4 - Ficar em dia com as atividades da Generation"));
		return objetivos;
	}
}