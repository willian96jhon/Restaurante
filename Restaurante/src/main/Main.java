/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import static controller.Conexao.testa;
import views.CadastroRestaurante_GUI;
import views.TelaPrincipal_GUI;

/**
 *
 * @author Cliente MMS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testa();
        new CadastroRestaurante_GUI().setVisible(true);
        // TODO code application logic here
    }
    
}
