package cep.application;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner readCEP = new Scanner (System.in);
        System.out.println("Digite o CEP da cidade: ");
        String cep = readCEP.nextLine();



        readCEP.close();

    }
}