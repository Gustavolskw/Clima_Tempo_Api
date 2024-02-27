package com.clima.tempo.clima_tempo.entity;

import com.clima.tempo.clima_tempo.model.ClimaRequestDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity(name="sp_2022")
@Table(name="sp_2022")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Sp2022 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Data")
    private String data;
    @Column(name="Hora_UTC")
    private String hora;
    @Column(name="TEMPERATURA_MAXIMA")
    private Double tempMax;
    @Column(name="TEMPERATURA_MINIMA")
    private Double tempMin;
    @Column(name="TEMPERATURA_MEDIA")
    private Double tempMed;

    public Sp2022(ClimaRequestDTO requestClima){

    }
}
