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
public class TesteCadastrarCidade {
//Funcionando
    public static void main(String[] args) throws Exception {
        CidadeDTO cidade = new CidadeDTO();
        cidade.setCidNome("Fulano de Tal");
        cidade.setCidCEP("71909000");
        CidadeDAL dal = new CidadeDAL();
        dal.incluirCidade(cidade);
        System.out.print("Cidade " + cidade.getCidNome() + " Cadastrada com sucesso!");
    }
}
