package br.com.glandata.models;

import lombok.Getter;
import lombok.ToString;

@ToString
public class Colaborador {
	public Colaborador(String nome, Integer numeroRegistro) {
		this.nome = nome;
		this.numeroRegistro = numeroRegistro;
	}

	@Getter
	private String nome;

	@Getter
	private Integer numeroRegistro;

}
