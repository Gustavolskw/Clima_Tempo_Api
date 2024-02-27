package com.clima.tempo.clima_tempo.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Sp2023Repository extends JpaRepository<Sp2023, Long> {

    Sp2023 findByDataLike(String data);
    Sp2023 findByTempMax(Double maxima);
    Sp2023 findByTempMin(Double minima);
    Sp2023 findByTempMed(Double media);
}
