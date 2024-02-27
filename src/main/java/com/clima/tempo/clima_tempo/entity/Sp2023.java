package com.clima.tempo.clima_tempo.entity;

import com.clima.tempo.clima_tempo.model.ClimaRequestDTO;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;
@Entity(name="sp_2023")
@Table(name="sp_2023")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of="id")
public class Sp2023 {
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

    public Sp2023(ClimaRequestDTO requestClima){
        this.data= requestClima.data();
        this.hora = requestClima.hora();
        this.tempMax = requestClima.tmpMax();
        this.tempMin = requestClima.tempMin();
        this.tempMed = requestClima.tempMed();
    }
}
