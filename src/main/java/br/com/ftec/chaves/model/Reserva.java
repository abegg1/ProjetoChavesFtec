package br.com.ftec.chaves.model;

import java.util.Calendar;

public class Reserva {
    
    private Sala sala;
    private Colaborador colaborador;
    private String turno;
    private String dia;

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public String getTurno() {
        return turno;
    }

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }
    
    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
    
}
