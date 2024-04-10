package com.example.teste.dtos;

import jakarta.validation.constraints.NotBlank;

public record AlunoDto(@NotBlank String nome, @NotBlank String curso) {
}
