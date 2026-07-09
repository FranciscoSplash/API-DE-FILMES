package com.example.api;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.models.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private ApiService apiService;

    @GetMapping("/filmes/buscar")
    @Operation(summary = "pesquisar", description = "Pesquisar filmes")
    public ResponseEntity <Flux<ApiDto>>buscarFilme(@RequestParam String nome){
        return new ResponseEntity<>(apiService.buscarFilme(nome), HttpStatus.ACCEPTED);
    }

    @GetMapping("/filmes")
    @Operation(summary = "listar", description = "Lista todos os filmes")
    public ResponseEntity<Flux<ApiDto>>listarFilmes(){
        return ResponseEntity.ok(apiService.listarFilme());
    }
}
