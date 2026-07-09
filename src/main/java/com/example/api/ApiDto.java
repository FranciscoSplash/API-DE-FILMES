package com.example.api;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public record ApiDto(
        @JsonProperty("results") List<ResultadoFilme> resultados) {
    // Esse record interno vai mapear cada filme individual dentro da lista
    public record ResultadoFilme(
            @JsonProperty("id") Long id,
            @JsonProperty("title") String titulo,
            @JsonProperty("original_title") String tituloOriginal,
            @JsonProperty("overview") String sinopse,
            @JsonProperty("release_date") String dataLancamento,
            @JsonProperty("poster_path") String caminhoPoster,
            @JsonProperty("vote_average") Double notaMedia,
            @JsonProperty("genre_ids") List<Integer> idsGeneros
    ) { }
}
