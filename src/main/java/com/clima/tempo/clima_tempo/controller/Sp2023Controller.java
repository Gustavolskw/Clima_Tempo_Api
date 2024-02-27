package com.clima.tempo.clima_tempo.controller;

import com.clima.tempo.clima_tempo.entity.Sp2023;
import com.clima.tempo.clima_tempo.entity.Sp2023Repository;
import com.clima.tempo.clima_tempo.model.Clima2022ResponseDTO;
import com.clima.tempo.clima_tempo.model.Clima2023ResponseDTO;
import com.clima.tempo.clima_tempo.services.Estatisticas;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.DecimalFormat;
import java.util.List;

@RestController
@RequestMapping("2023")
public class Sp2023Controller {
    @Autowired
    private Estatisticas estatisticas;

    @Autowired
    private Sp2023Repository repository;

    private DecimalFormat df = new DecimalFormat("#.##");

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/all")
    public ResponseEntity<List<Clima2023ResponseDTO>> getAllClimas(){
        List<Clima2023ResponseDTO> climaList = repository.findAll().stream().map(Clima2023ResponseDTO::new).toList();

        return ResponseEntity.ok().body(climaList);
    }
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public ResponseEntity getClimaByDate(@RequestParam("data") String data){
        var clima = repository.findByDataLike(data);
        return ResponseEntity.status(200).body(clima);
    }

    @GetMapping("/temp/maxima")
    public ResponseEntity maiorMaxima(){
        var maiorMaxima = estatisticas.maiorMaxima2023();
        return ResponseEntity.ok().body(maiorMaxima);
    }

    @GetMapping("/temp/minima")
    public ResponseEntity menorMinima(){
        var menorMaxima = estatisticas.menorMinimaAno2023();
        return ResponseEntity.ok().body(menorMaxima);
    }

    @GetMapping("/med/maior")
    public ResponseEntity maiorMed(){
        var maiorMed = estatisticas.maiorMed2023();
        return ResponseEntity.ok().body(maiorMed);
    }

    @GetMapping("/med/menor")
    public ResponseEntity menorMed(){
        var menorMed = estatisticas.menorMedAno2023();
        return ResponseEntity.ok().body(menorMed);
    }
    @GetMapping("/media")
    public ResponseEntity mediaAno2023(){
        Double menorMed = estatisticas.medAno2023();

        return ResponseEntity.ok().body(df.format(menorMed));
    }


}
