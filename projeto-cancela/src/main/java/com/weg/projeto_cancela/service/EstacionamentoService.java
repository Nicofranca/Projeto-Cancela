package com.weg.projeto_cancela.service;

import com.weg.projeto_cancela.model.RegistroCancela;
import com.weg.projeto_cancela.repository.RegistroCancelaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstacionamentoService {

    private RegistroCancelaRepository repository;

    public EstacionamentoService(RegistroCancelaRepository repository){
        this.repository = repository;
    }

    private final int CAPACIDADE_TOTAL = 1381;

    public List<RegistroCancela> buscarEntradas(){
        return repository.findByEvento("Carro Entrando");
    }

    public List<RegistroCancela> buscarSaidas(){
        return repository.findByEvento("Carro Saindo");
    }

    public List<RegistroCancela> buscarAberturasPorBotao(){
        return repository.findByEventoContainingIgnoreCase("Botao Fisico");
    }

    public int calcularVagasDisponiveis(){
        long totalEntradas = repository.countByEvento("Carro Entrando");
        long totalSaidas = repository.countByEvento("Carro Saindo");

        long carrosDentro = totalEntradas - totalSaidas;

        if (carrosDentro < 0){
            carrosDentro = 0;
        }

        return (int) (CAPACIDADE_TOTAL - carrosDentro);
    }
}
