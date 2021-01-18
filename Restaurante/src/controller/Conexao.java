/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author Cliente MMS
 */
public class Conexao {
    public static void testa(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Conexão Bem Sucedida");
        }catch(Exception e){
            System.out.println("Erro na Conexão");
        }
    }
}
