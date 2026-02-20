package com.weg.projeto_cancela.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.Instant;

@Document(collection = "historico")
public class RegistroCancela {
    @Id
    private String id;
    private String evento;
    private Instant data;

    public RegistroCancela() {
    }

    public RegistroCancela(String id, String evento, Instant data) {
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

    public Instant getData() {
        return data;
    }

    public void setData(Instant data) {
        this.data = data;
    }
}
