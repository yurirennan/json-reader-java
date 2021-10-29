package com.yuri.json;

import java.io.FileNotFoundException;

// Java program to read JSON from a file

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Leitura {

    public static void main(String[] args) throws FileNotFoundException, IOException, ParseException {

        Object obj = new JSONParser().parse(new FileReader("./src/main/java/teste.json"));

        JSONObject jsonzinho = (JSONObject) obj;

        System.out.println("");
        System.out.println("Usando Expressão Lambda");

        // Usando Expressão Lambda
        jsonzinho.keySet().forEach(chave ->
        {
            Object valor = jsonzinho.get(chave);
            System.out.println("Chave: "+ chave + " -  Valor: " + valor);
        });

        System.out.println("");
        System.out.println("Usando For");

        // Usando For
        for (Object chave : jsonzinho.keySet()) {
            Object valor = jsonzinho.get(chave);

            //Print key and value
            System.out.println("Chave: "+ chave + " -  Valor: " + valor);
        }

        System.out.println("");
        System.out.println("Usando while");

        //Usando while
        Iterator<String> iterator = jsonzinho.keySet().iterator();
        while (iterator.hasNext())
        {
            Object chave = iterator.next();
            Object valor = jsonzinho.get(chave);

            System.out.println("Chave: " + chave + " - " + " Valor: " + valor);
        }
    }
}
