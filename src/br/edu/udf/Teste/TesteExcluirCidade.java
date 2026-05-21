/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.udf.Teste;

import br.edu.udf.DAL.CidadeDAL;

/**
 *
 * @author joao1
 */
public class TesteExcluirCidade {
//Funcionando
    public static void main(String[] args) throws Exception {
        CidadeDAL dal = new CidadeDAL();
        dal.excluirCidade(1);
        System.out.print("Cidade Excluída com sucesso!");
    }
}
