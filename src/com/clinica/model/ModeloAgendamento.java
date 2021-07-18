package com.clinica.model;

import java.util.Date;

/**
 *
 * @author JuneHendrix
 */
public class ModeloAgendamento {
    
    private int agendaCod;
    private String comboNomeDentista;
    private String comboNomePaciente;
    private String turno;
    private Date data;
    private String sintomas;
    private String Status;
    private float peso;
    private String dataNasc;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public int getAgendaCod() {
        return agendaCod;
    }

    public void setAgendaCod(int agendaCod) {
        this.agendaCod = agendaCod;
    }

    public String getComboNomeDentista() {
        return comboNomeDentista;
    }

    public void setComboNomeDentista(String comboNomeDentista) {
        this.comboNomeDentista = comboNomeDentista;
    }

    public String getComboNomePaciente() {
        return comboNomePaciente;
    }

    public void setComboNomePaciente(String comboNomePaciente) {
        this.comboNomePaciente = comboNomePaciente;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

  

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * @return the sintomas
     */
    public String getSintomas() {
        return sintomas;
    }

    /**
     * @param sintomas the sintomas to set
     */
    public void setSintomas(String sintomas) {
        this.sintomas = sintomas;
    }
    
}
