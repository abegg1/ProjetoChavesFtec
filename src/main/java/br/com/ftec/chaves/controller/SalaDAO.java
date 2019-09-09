package br.com.ftec.chaves.controller;

import br.com.ftec.chaves.model.Sala;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class SalaDAO {

    public SalaDAO() {}
  
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

     public Sala buscarSalaPorSala(String salaIdentificacao){
        
        String sqlInsercaoSala = "SELECT * FROM sala WHERE sala = ?";

        Sala sala = new Sala();
        
        Connection conexaoBancoDados = null;
        PreparedStatement parametrosInsersao = null;
        ResultSet resultado = null;
        
        try {
            conexaoBancoDados = ConnectionFactory.createConnectionToMySQL();
            parametrosInsersao = conexaoBancoDados.prepareStatement(sqlInsercaoSala);
            parametrosInsersao.setString(1,salaIdentificacao);
            resultado = parametrosInsersao.executeQuery();   
            while(resultado.next()){
                sala.setId(resultado.getInt("id"));
                sala.setCapacidade(resultado.getInt("capacidade"));
                sala.setDescricao(resultado.getString("descricao"));
                sala.setTipo(resultado.getString("tipo"));
                sala.setSala(resultado.getString("sala"));
            } 
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
        return sala;
    }   
}
