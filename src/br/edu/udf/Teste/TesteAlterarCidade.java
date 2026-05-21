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
public class TesteAlterarCidade {
//Funcionando
    public static void main(String[] args) throws Exception {
        CidadeDAL dal = new CidadeDAL();
        CidadeDTO cidade = new CidadeDTO();
        cidade.setCidId(1);
        cidade.setCidNome("Javier Souto Maior");
        cidade.setCidCEP("59874666");
        dal.alterarCidade(cidade);
        System.out.print("Cidade " + cidade.getCidNome() + " Alterado com sucesso!");
    }
}
