/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.udf.Teste;

import br.edu.udf.DAL.CidadeDAL;
import br.edu.udf.DTO.CidadeDTO;

/**
 *
 * @author joao1
 */
public class TesteSelecionarCidade {
//Funcionando
    public static void main(String[] args) throws Exception {
        CidadeDAL dal = new CidadeDAL();
        CidadeDTO cidade = dal.selecionarCidadePorID(1);
        System.out.println("Codigo: " + cidade.getCidId());
        System.out.println("Nome Cidade: " + cidade.getCidNome());
        System.out.println("CEP: " + cidade.getCidCEP());
       
    }
}
