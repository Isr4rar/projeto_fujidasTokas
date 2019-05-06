package com.isra.entites.domain;

import java.io.BufferedReader;
import java.io.FileReader;

import com.google.gson.Gson;
import com.isra.entites.Pessoa;

public class ProgramRead {
	
	public static void main(String[] args) {
		Gson gson = new Gson();
		try {
			
			BufferedReader lerPessoa = new BufferedReader(new FileReader("Json/Pessoa.json"));

			Pessoa pessoa = (Pessoa) gson.fromJson(lerPessoa, Pessoa.class);
			
			
			System.out.println(pessoa.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}
}
}
