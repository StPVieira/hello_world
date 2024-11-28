package com.helloWorld.helloWorld.controller;

import java.util.ArrayList;
import java.util.Arrays;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloWorld {

    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World!";
    }

    @GetMapping("/bsm")
    public ArrayList<String> bsmGeneration() {
        ArrayList<String> bsm = new ArrayList<>();
        bsm.addAll(Arrays.asList(
            "Mentalidade de Crescimento", 
            "Persistência", 
            "Orientação ao Futuro", 
            "Responsabilidade Pessoal",
            "Comunicação", 
            "Proatividade", 
            "Orientação ao Detalhe", 
            "Trabalho em Equipe"
        ));
        return bsm;
    }

    @GetMapping("/objetivos")
    public ArrayList<String> objetivos() {
        ArrayList<String> objetivos = new ArrayList<>();
        objetivos.addAll(Arrays.asList(
            "1 - Desenvolver uma aplicação MVP até domingo.",
            "2 - Estudar typescript",
            "3 - Terminar mais uma semana do CS50",
            "4 - Ficar em dia com as atividades da Generation"
        ));
        return objetivos;
    }
}