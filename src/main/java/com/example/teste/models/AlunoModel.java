package com.example.teste.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name="tb_aluno")
public class AlunoModel extends UsuarioModel implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String curso;

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}