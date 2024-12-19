package cep.application;

import cep.connection.Connection;
import cep.connection.Conversion;
import cep.dto.InfoCEP;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner readCEP = new Scanner (System.in);
        System.out.println("Digite o CEP da cidade: ");
        String cep = readCEP.nextLine();

        String responseBodyAPI = Connection.requestCEP(cep);

        //Retorno da conversao de Json padrao da API para String da classe record InfoCEP (com os atributos desejados)
        InfoCEP infoCEPFromJson = Conversion.conversionFromJson(responseBodyAPI);
        System.out.println(infoCEPFromJson);

        //Retorno da conversao da String da classe record InfoCEP para Json formatado na saida
        String infoCEPToJson = Conversion.conversionToJson(infoCEPFromJson);
        System.out.println(infoCEPFromJson);

        //print da API completa do CEP digitado
        //System.out.println(Connection.requestCEP(cep));
        
        readCEP.close();

    }
}