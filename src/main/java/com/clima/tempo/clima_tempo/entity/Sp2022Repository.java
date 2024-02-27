package com.clima.tempo.clima_tempo.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Sp2022Repository extends JpaRepository<Sp2022, Long> {

    Sp2022 findByDataLike(String data);
    Sp2022 findByTempMax(Double maiorTempAno);
    Sp2022 findByTempMin(Double menorTempAno);
}
