package br.com.ftec.chaves.controller;

import br.com.ftec.chaves.model.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ColaboradorDAO {
    
   public void salvar(Colaborador colaborador){
     
        String sqlInsercaoSala = "insert into colaborador(nome,cpf,senha,telefone,email) "
                + "VALUES(?,?,?,?,?);";

        Connection conexaoBancoDados = null;
        PreparedStatement parametrosInsersao = null;
        
        try {
            conexaoBancoDados = ConnectionFactory.createConnectionToMySQL();
            parametrosInsersao = conexaoBancoDados.prepareStatement(sqlInsercaoSala);
            parametrosInsersao.setString(1,colaborador.getNome());
            parametrosInsersao.setString(2,colaborador.getCpf());
            parametrosInsersao.setString(3,colaborador.getSenha());
            parametrosInsersao.setString(4,colaborador.getTelefone());
            parametrosInsersao.setString(5,colaborador.getEmail());
            parametrosInsersao.execute();   
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }    
    
    
    
}
