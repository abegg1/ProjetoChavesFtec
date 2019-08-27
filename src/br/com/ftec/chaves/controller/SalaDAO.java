package br.com.ftec.chaves.controller;

import br.com.ftec.chaves.model.Sala;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SalaDAO {

    public SalaDAO() {
        
  
    }
  
    public void salvar(Sala sala){
        
        String sqlInsercaoSala = "insert into sala(sala,descricao,capacidade,tipo) "
                + "VALUES(?,?,?,?);";

        Connection conexaoBancoDados = null;
        PreparedStatement parametrosInsersao = null;
        
        try {
            conexaoBancoDados = ConnectionFactory.createConnectionToMySQL();
            parametrosInsersao = conexaoBancoDados.prepareStatement(sqlInsercaoSala);
            parametrosInsersao.setString(1,sala.getSala());
            parametrosInsersao.setString(2,sala.getDescricao());
            parametrosInsersao.setInt(3,sala.getCapacidade());
            parametrosInsersao.setString(4,sala.getTipo());
            parametrosInsersao.execute();   
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }    
}
