
package com.clinica.model;


public class ModeloMedico {

    
    public String getTel() {
        return tel;
    }

    
    public void setTel(String tel) {
        this.tel = tel;
    }

    
    public String getEmail() {
        return email;
    }

    
    public void setEmail(String email) {
        this.email = email;
    }
    
    private int id;
    private String nome;
    private String endereco;
    private String especialidade;
    private String filtrar;
    private String tel;
    private String email;

   
    public int getId() {
        return id;
    }

    
    public void setId(int id) {
        this.id = id;
    }

    
    public String getNome() {
        return nome;
    }

   
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public String getEndereco() {
        return endereco;
    }

    
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

   
    public String getEspecialidade() {
        return especialidade;
    }

    
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    
    public String getFiltrar() {
        return filtrar;
    }

   
    public void setFiltrar(String filtrar) {
        this.filtrar = filtrar;
    }
    
}
