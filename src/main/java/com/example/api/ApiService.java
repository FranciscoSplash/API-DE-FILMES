package com.example.api;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;


@Service
public class ApiService {


    private WebClient webClient;

    public ApiService(WebClient.Builder webClient){
        this.webClient =webClient.baseUrl("https://api.themoviedb.org/").build();

    }
    //RestClient-->sincrona
    //WebClient---> Assincrona


    //Mono--->para um elemento apenas
    //flux--->um ou mais elementos
    public Flux<ApiDto> buscarFilme(String nome){

        String chave="e33437e7f8d0d9cb7c56b8a2587088c1";

        return this.webClient.get().uri(
                uriBuilder -> uriBuilder.path("3/search/movie")
                        .queryParam("api_key", chave)
                        .queryParam("query", nome).build())
                .retrieve().bodyToFlux(ApiDto.class);
    }
public Flux<ApiDto> listarFilme(){
    String chave="e33437e7f8d0d9cb7c56b8a2587088c1";

        return this.webClient.get().uri(
                uriBuilder -> uriBuilder.path("3/movie/popular")
                        .queryParam("api_key", chave).build())
                .retrieve().bodyToFlux(ApiDto.class);
}
}
