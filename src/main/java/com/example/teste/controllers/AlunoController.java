package com.example.teste.controllers;

import com.example.teste.dtos.AlunoDto;
import com.example.teste.models.AlunoModel;
import com.example.teste.repositories.UsuarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aluno")
public class AlunoController {
    @Autowired
    private UsuarioRepository usuarioRepository;


    @PostMapping("/salvar")
    public ResponseEntity<AlunoModel> salvar(@RequestBody @Valid AlunoDto alunoDto){
        AlunoModel usuario = new AlunoModel();
        BeanUtils.copyProperties(alunoDto, usuario);
        return ResponseEntity.status(HttpStatus.CREATED).body(usuarioRepository.save(usuario));
    }
}
