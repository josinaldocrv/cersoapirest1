package com.cursoapirest.modulos.pessoa_fisica.model;

import java.io.Serializable;

public class PessoaFisica implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;
    private String nome;
    private String email;
    private String cpf;

    public PessoaFisica(){}

    public PessoaFisica(Long id, String nome, String email, String cpf) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.cpf = cpf;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof PessoaFisica)) return false;
        if (!super.equals(object)) return false;
        PessoaFisica that = (PessoaFisica) object;
        return java.util.Objects.equals(id, that.id);
    }

    public int hashCode() {
        return java.util.Objects.hash(super.hashCode(), id);
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}

