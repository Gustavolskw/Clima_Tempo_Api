package com.clima.tempo.clima_tempo.model;

import java.util.Date;

public record ClimaRequestDTO(String data, String hora, Double tmpMax, Double tempMin, Double tempMed) {
}
