package com.blamovi.apiblamovi.controllers;

import com.blamovi.apiblamovi.models.PostModel;
import com.blamovi.apiblamovi.repositories.PostRepository;
import com.blamovi.apiblamovi.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/posts", produces = {"application/json"})
public class PostController {
    @Autowired
    PostRepository postRepository;
    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public ResponseEntity<List<PostModel>> listarPost(){
        return ResponseEntity.status(HttpStatus.OK).body(postRepository.findAll());
    }

}
