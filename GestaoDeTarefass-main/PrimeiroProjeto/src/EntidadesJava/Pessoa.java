package EntidadesJava;

import java.util.Scanner;
public class Pessoa {
private String nome;


Scanner scanner = new Scanner(System.in);

public Pessoa(String nome) {
    this.nome = nome;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}
}
