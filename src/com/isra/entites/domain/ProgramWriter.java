package com.isra.entites.domain;

import java.io.FileWriter;

import com.google.gson.Gson;
import com.isra.entites.Pessoa;

public class ProgramWriter {


	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa("Israel Araujo", "09696767439", "isra.rar@icloud.com", 22);

		Gson gson = new Gson();
		String json = gson.toJson(pessoa);
		System.out.println(json);

		try {
			FileWriter fw = new FileWriter("Json/Pessoa.json");

			fw.write(json);
			fw.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}





}
