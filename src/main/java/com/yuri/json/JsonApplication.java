package com.yuri.json;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import org.json.simple.JSONObject;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


import java.io.PrintWriter;

@SpringBootApplication
public class JsonApplication {

    public static void main(String[] args) throws FileNotFoundException {
        SpringApplication.run(JsonApplication.class, args);

        JSONObject json = new JSONObject();

        json.put("Nome", "Julio");
        json.put("Sobrenome", "Smith");
        json.put("Idade", "25");
//        json.put("Nome", "Julio");
//        json.put("Sobrenome", "Valor");
//        json.put("Idade", "25");

        System.out.println(json);

        // write json to file
        PrintWriter salvar = new PrintWriter("./src/main/java/teste.json");
        salvar.write(json.toJSONString());

        salvar.flush();
        salvar.close();


    }

}
