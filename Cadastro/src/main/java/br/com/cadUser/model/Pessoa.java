package br.com.cadUser.model;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
	private String nome;
	private List<String> nomesDigitados = new ArrayList<>();
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<String> getNomesDigitados() {
		return nomesDigitados;
	}
	
	public void setNomesDigitados(List<String> nomesDigitados) {
	        this.nomesDigitados = nomesDigitados;
	    }
}
