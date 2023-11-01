package com.blamovi.apiblamovi.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import java.util.Date;

public record UsuarioDto(
        @NotBlank String nome,
        @NotBlank String senha,


        @NotBlank @Email(message = "O email deve estar em um formato válido!") String email,
        @NotBlank String apelido
){

}

