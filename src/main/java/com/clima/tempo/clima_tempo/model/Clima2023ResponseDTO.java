package com.clima.tempo.clima_tempo.model;

import com.clima.tempo.clima_tempo.entity.Sp2023;

import java.util.Date;

public record Clima2023ResponseDTO(Long id, String data, String hora, Double tmpMax, Double tmpMin, Double tmpMed){
    public Clima2023ResponseDTO(Sp2023 sp2023){
        this(sp2023.getId(), sp2023.getData(), sp2023.getHora(), sp2023.getTempMax(), sp2023.getTempMin(), sp2023.getTempMed());
    }
}
