package com.unicesumar.programacaoDeSistemas2.implementacaoDeCRUDDeClientes.model.entities;

import java.util.HashMap;

public class Cliente {

    private String nome;
    private int codigo;
    private String email;
    private String telefone;

    public Cliente(String nome, int codigo, String email, String telefone) {
        this.nome = nome;
        if (codigo != this.codigo){
            this.codigo = codigo;
        }
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

}
