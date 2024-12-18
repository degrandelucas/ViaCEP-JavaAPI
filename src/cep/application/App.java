package cep.application;

import cep.connection.Connection;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner readCEP = new Scanner (System.in);
        System.out.println("Digite o CEP da cidade: ");
        String cep = readCEP.nextLine();
        String infomationOfCEP = String.valueOf(Connection.requestCEP(cep));

        System.out.println(infomationOfCEP);

        readCEP.close();

    }
}