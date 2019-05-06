package com.isra.entites;

import java.io.Serializable;

public class Pessoa implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String cpf;
	private String email;
	private Integer idade;
	
	
	public Pessoa(String name, String cpf, String email, Integer idade) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.email = email;
		this.idade = idade;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public Integer getIdade() {
		return idade;
	}


	public void setIdade(Integer idade) {
		this.idade = idade;
	}


	@Override
	public String toString() {
		return "Pessoa { \n 'name':" + name + ",\n 'cpf':" + cpf + ",\n 'email:'" + email + ",\n 'idade':" + idade + " \n}";
	}

	
	
	
}
