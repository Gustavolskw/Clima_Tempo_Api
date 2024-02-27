package com.clima.tempo.clima_tempo.model;

import com.clima.tempo.clima_tempo.entity.Sp2022;

import java.util.Date;

public record Clima2022ResponseDTO(Long id, String data, String hora, Double tmpMax, Double tmpMin, Double tmpMed){
    public Clima2022ResponseDTO(Sp2022 sp2022){
        this(sp2022.getId(), sp2022.getData(), sp2022.getHora(), sp2022.getTempMax(), sp2022.getTempMin(), sp2022.getTempMed());
    }
}
