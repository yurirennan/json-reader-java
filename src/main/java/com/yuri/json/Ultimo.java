package com.yuri.json;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.LinkedHashMap;
import java.util.Map;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Ultimo {

    public static void main(String[] args) throws FileNotFoundException {
        SpringApplication.run(Ultimo.class, args);
        JSONObject jsonzinho = new JSONObject();

        jsonzinho.put("Nome", "Julio");
        jsonzinho.put("Sobrenome", "Smith");
        jsonzinho.put("idade", 25);
        jsonzinho.put("Nome", "Julio");
        jsonzinho.put("Sobrenome", "Smith");
        jsonzinho.put("idade", 25);

        JSONObject jsonzinho2 = new JSONObject();
        jsonzinho2.put("Nome", "Julio");
        jsonzinho2.put("Sobrenome", "Smith");
        jsonzinho2.put("idade", 25);

        System.out.println(jsonzinho);
        System.out.println(jsonzinho2);

        PrintWriter salvar = new PrintWriter("./src/main/java/teste2.json");
        salvar.write("[");
        salvar.write(jsonzinho.toJSONString());
        salvar.write(",");
        salvar.write(jsonzinho2.toJSONString());
        salvar.write("]");

        salvar.flush();
        salvar.close();
    }

}