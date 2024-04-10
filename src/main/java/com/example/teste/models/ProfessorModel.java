package com.example.teste.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Table(name="tb_professor")
public class ProfessorModel extends UsuarioModel implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private String disciplina;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
}