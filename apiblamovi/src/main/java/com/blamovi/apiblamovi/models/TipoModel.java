package com.blamovi.apiblamovi.models;

public enum TipoModel {
    ADMIN("admin"),
    USUARIO("usuario");

    private String tipo;

    TipoModel(String tipoRecebido){
        this.tipo = tipoRecebido;
    }

    public String getRole(){
        return tipo;
    }
}
