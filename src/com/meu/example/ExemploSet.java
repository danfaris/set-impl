package com.meu.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class ExemploSet {

	public static void main(String[] args) {
		
		
		Set<String> set = new HashSet<String>();
		set.add("Primeiro");
		set.add("Segundo");
		set.add("Terceiro");
		
		System.out.println(set);
		
		System.out.println(set.size());
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		
		map.put("Nome", 132);
		map.put("Sobrenome", 9);
		map.put("nomes", 333);
		map.put("mais nome", 23);
		
		
		System.out.println(map);
		
		Gson gson = new GsonBuilder().create();
		String jsonString = gson.toJson(map);
		
	
		System.out.println("------------ *** --------------");
		System.out.println(jsonString);
		
		
		
		
		
		
	}
}
