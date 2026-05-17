/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.udf.DAL;

import br.edu.udf.DTO.CidadeDTO;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author joao1
 */
public class CidadeDAL extends ConexaoMySQL {
    //Método para incluir um cliente na tabela cliente

    public void incluirCidade(CidadeDTO cidade) throws Exception {
//Prepara a conexão com o MySQL
        abrirBD();
        SQL = "INSERT INTO tbl_Cidade (cidId, cidNome, cidCEP) VALUES (?, ?, ?)";
        ps = con.prepareStatement(SQL);
//Busca os valores da classe ClienteDTO
        ps.setInt(1, cidade.getCidId());
        ps.setString(2, cidade.getCidNome());
        ps.setString(3, cidade.getCidCEP());
        ps.execute();
        fecharBD();
    }
    
    //Este método vai buscar um único cliente na tabela cliente, através da sua Chave Primária - PK(cliID)

    public CidadeDTO selecionarCidadePorID(Integer cidId) throws Exception {
        abrirBD();
        SQL = "SELECT * FROM tbl_Cidade WHERE cidId = ?";
        ps = con.prepareStatement(SQL);
        ps.setInt(1, cidId);
        rs = ps.executeQuery();
        CidadeDTO cidade = new CidadeDTO();
        if (rs.next()) {
            cidade.setCidId(rs.getInt("cidId"));
            cidade.setCidNome(rs.getString("cidNome"));
            cidade.setCidCEP(rs.getString("cidCEP"));
            fecharBD();
        }
        return cidade;
    }
    
    //Método que vai selecionar todos os clientes da nossa tabela cliente e ordenar por nome do cliente

    public List selecionarListaCidade() throws Exception {
        abrirBD();
        SQL = "SELECT * FROM tbl_Cidade ORDER BY cidId";
        ps = con.prepareStatement(SQL);
        rs = ps.executeQuery();
        List listaCidade = new ArrayList();
        while (rs.next()) {
            CidadeDTO cidade = new CidadeDTO();
            cidade.setCidId(rs.getInt("cidId"));
            cidade.setCidNome(rs.getString("cidNome"));
            cidade.setCidCEP(rs.getString("cidCEP"));
            listaCidade.add(cidade);
        }
        fecharBD();
        return listaCidade;
    }
    
    //Método que vai alterar um único cliente da tabela cliente, através da sua ChavePrimária - PK(cliID)

    public void alterarCidade(CidadeDTO cidade) throws Exception {
        abrirBD();
        SQL = "UPDATE tbl_Cidade SET cidNome = ?, cidCEP = ? WHERE cidId = ?";
        ps = con.prepareStatement(SQL);
        ps.setString(1, cidade.getCidNome());
        ps.setString(2, cidade.getCidCEP());
        ps.setInt(3, cidade.getCidId());
        ps.execute();
        fecharBD();
    }
    
    //Método que vai excluir um único cliente da tabela cliente, através da sua Chave Primária - PK(cliID)

    public void excluirCidade(Integer cidId) throws Exception {
        abrirBD();
        SQL = "DELETE FROM tbl_Cidade WHERE cidId = ?";
        ps = con.prepareStatement(SQL);
        ps.setInt(1, cidId);
        ps.execute();
        fecharBD();

    }
    
}
