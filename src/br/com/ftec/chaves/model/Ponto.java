package br.com.ftec.chaves.model;

import java.util.Calendar;

public class Ponto {
    
    private Colaborador colaborador;
    private Calendar dia;
    private boolean devolvida;
    private boolean retirada;

    public Colaborador getColaborador() {
        return colaborador;
    }

    public void setColaborador(Colaborador colaborador) {
        this.colaborador = colaborador;
    }

    public Calendar getDia() {
        return dia;
    }

    public void setDia(Calendar dia) {
        this.dia = dia;
    }

    public boolean isDevolvida() {
        return devolvida;
    }

    public void setDevolvida(boolean devolvida) {
        this.devolvida = devolvida;
    }

    public boolean isRetirada() {
        return retirada;
    }

    public void setRetirada(boolean retirada) {
        this.retirada = retirada;
    }
    
    
}
