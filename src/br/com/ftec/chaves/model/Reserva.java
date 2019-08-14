package br.com.ftec.chaves.model;

import java.util.Calendar;

public class Reserva {
    private Sala sala;
    private String turno;
    private Calendar dia;

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Calendar getDia() {
        return dia;
    }

    public void setDia(Calendar dia) {
        this.dia = dia;
    }
    
}
