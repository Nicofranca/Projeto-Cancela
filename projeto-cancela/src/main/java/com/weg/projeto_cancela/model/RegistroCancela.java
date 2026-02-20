package com.weg.projeto_cancela.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "historico")
public class RegistroCancela {
    @Id
    private String id;
    private String evento;
    private String data;

    public RegistroCancela() {
    }

    public RegistroCancela(String id, String evento, String data) {
        this.id = id;
        this.evento = evento;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
