package com.clima.tempo.clima_tempo.services;

import com.clima.tempo.clima_tempo.entity.Sp2022;
import com.clima.tempo.clima_tempo.entity.Sp2022Repository;
import com.clima.tempo.clima_tempo.entity.Sp2023;
import com.clima.tempo.clima_tempo.entity.Sp2023Repository;
import com.clima.tempo.clima_tempo.model.Clima2022ResponseDTO;
import com.clima.tempo.clima_tempo.model.Clima2023ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DecimalFormat;
import java.util.DoubleSummaryStatistics;
import java.util.stream.Collectors;

@Service
public class Estatisticas {
    @Autowired
    private Sp2023Repository repository2023;
    @Autowired
    private Sp2022Repository repository2022;


    public Sp2023 maiorMaxima2023(){
    var item = repository2023.findAll().stream().map(Clima2023ResponseDTO::new);
        DoubleSummaryStatistics estatisticas = item.collect(Collectors.summarizingDouble(Clima2023ResponseDTO::tmpMax));
           Double maiorTempAno = estatisticas.getMax();
            return repository2023.findByTempMax(maiorTempAno);
    }

    public Sp2022 maiorMaxima2022(){
        var item = repository2022.findAll().stream().map(Clima2022ResponseDTO::new);
        DoubleSummaryStatistics estatisticas = item.collect(Collectors.summarizingDouble(Clima2022ResponseDTO::tmpMax));
        Double maiorTempAno = estatisticas.getMax();
        return repository2022.findByTempMax(maiorTempAno);
    }


    public Sp2023 menorMinimaAno2023(){
        var item = repository2023.findAll().stream().map(Clima2023ResponseDTO::new);
        DoubleSummaryStatistics estatisticas = item.collect(Collectors.summarizingDouble(Clima2023ResponseDTO::tmpMin));
        Double menorMaxAno = estatisticas.getMin();
        return repository2023.findByTempMin(menorMaxAno);
    }

    public Sp2022 menorMinimaAno2022(){
        var item = repository2022.findAll().stream().map(Clima2022ResponseDTO::new);
        DoubleSummaryStatistics estatisticas = item.collect(Collectors.summarizingDouble(Clima2022ResponseDTO::tmpMin));
        Double menorMaxAno = estatisticas.getMin();
        return repository2022.findByTempMin(menorMaxAno);
    }


    public Sp2023 maiorMed2023(){
        var item = repository2023.findAll().stream().map(Clima2023ResponseDTO::new);
        DoubleSummaryStatistics estatisticas = item.collect(Collectors.summarizingDouble(Clima2023ResponseDTO::tmpMed));
        Double maiorMedAno = estatisticas.getMax();
        return repository2023.findByTempMed(maiorMedAno);
    }
    public Sp2023 menorMedAno2023(){
        var item = repository2023.findAll().stream().map(Clima2023ResponseDTO::new);
        DoubleSummaryStatistics estatisticas = item.collect(Collectors.summarizingDouble(Clima2023ResponseDTO::tmpMed));
        Double menorMedAno = estatisticas.getMin();
        return repository2023.findByTempMed(menorMedAno);
    }
    public Sp2022 maiorMed2022(){
        var item = repository2022.findAll().stream().map(Clima2022ResponseDTO::new);
        DoubleSummaryStatistics estatisticas = item.collect(Collectors.summarizingDouble(Clima2022ResponseDTO::tmpMed));
        Double maiorTempAno = estatisticas.getMax();
        return repository2022.findByTempMin(maiorTempAno);
    }
    public Sp2022 menorMedAno2022(){
        var item = repository2022.findAll().stream().map(Clima2022ResponseDTO::new);
        DoubleSummaryStatistics estatisticas = item.collect(Collectors.summarizingDouble(Clima2022ResponseDTO::tmpMed));
        Double menorMaxAno = estatisticas.getMin();
        return repository2022.findByTempMin(menorMaxAno);
    }

    public Double  medAno2023(){
        var item = repository2023.findAll().stream().map(Clima2023ResponseDTO::new);
        DoubleSummaryStatistics estatisticas = item.collect(Collectors.summarizingDouble(Clima2023ResponseDTO::tmpMed));
        return estatisticas.getAverage();
    }
    public Double medAno2022(){

        var item = repository2022.findAll().stream().map(Clima2022ResponseDTO::new);
        DoubleSummaryStatistics estatisticas = item.collect(Collectors.summarizingDouble(Clima2022ResponseDTO::tmpMed));
        return estatisticas.getAverage();

    }











}
