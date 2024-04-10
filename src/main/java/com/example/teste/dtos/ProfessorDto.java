package com.example.teste.dtos;

import jakarta.validation.constraints.NotBlank;

public record ProfessorDto(@NotBlank String nome, @NotBlank String disciplina) {
}
