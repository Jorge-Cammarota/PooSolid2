package Exercicio3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String,List<String>> dicionarios= new HashMap<>();

        List<String> cor = new ArrayList<>();
        cor.add("preto");
        cor.add("branco");
        cor.add("vermelho");
        cor.add("azul");


        dicionarios.put("Mesa",cor);
        dicionarios.put("Telefone",cor);
        dicionarios.put("Tinta",cor);
        dicionarios.put("caneta",cor);


        Exercicio3.Dicionario dicionario = new Exercicio3.Dicionario();

        dicionario.setDicionario(dicionarios);


        System.out.println(dicionario.getDicionario());

        for (Map.Entry<String, List<String>> pair : dicionarios.entrySet()) {
            System.out.println(pair.getKey()+"-"+pair.getValue());

        }
    }
}