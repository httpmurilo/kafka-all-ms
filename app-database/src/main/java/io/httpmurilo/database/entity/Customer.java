package io.httpmurilo.database.entity;

import jakarta.persistence.Id;

public class Customer {

    public Customer(String nome, String cpf, String email, String status) {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.status = status;
    }

    @Id
    private Integer id;
    private String nome;
    private String cpf;
    private String email;
    private String status;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static class Builder{

        public Builder() {
        }

        private String nome;
        private String cpf;
        private String email;
        private String status;

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder cpf(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Customer build() {
            return new Customer(nome, cpf, email, status);
        }
    }
}
