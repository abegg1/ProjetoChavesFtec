package br.com.ftec.chaves.controller;

import br.com.ftec.chaves.model.Reserva;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ReservaDAO {

    public ReservaDAO() {
    }
    
    public void salvar(Reserva reserva){
        
        String sqlInsercaoSala = "insert into reserva(id_colaborador,id_sala,dia,turno) "
                + "VALUES(?,?,?,?)";

        Connection conexaoBancoDados = null;
        PreparedStatement parametrosInsersao = null;
        
        try {
            conexaoBancoDados = ConnectionFactory.createConnectionToMySQL();
            parametrosInsersao = conexaoBancoDados.prepareStatement(sqlInsercaoSala);
            parametrosInsersao.setInt(1,reserva.getColaborador().getId());
            parametrosInsersao.setInt(2,reserva.getSala().getId());
            parametrosInsersao.setString(3,reserva.getDia());
            parametrosInsersao.setString(4,reserva.getTurno());
            parametrosInsersao.execute();   
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SalaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(SalaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }

}
