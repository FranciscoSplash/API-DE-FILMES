🎬 API de Filmes — Spring WebFlux + TMDB

API REST reativa construída com Spring Boot e WebClient que consome a API do The Movie Database (TMDB) para buscar e listar filmes.

🚀 Funcionalidades


🔍 Buscar filmes por nome — pesquisa filmes na base do TMDB
📃 Listar filmes populares — retorna os filmes mais populares do momento
⚡ Programação reativa — consumo assíncrono e não-bloqueante com WebClient (Mono/Flux)
📚 Documentação com Swagger/OpenAPI


🛠️ Tecnologias


Java 17+
Spring Boot
Spring WebFlux (WebClient)
Project Reactor (Mono / Flux)
SpringDoc OpenAPI (Swagger)
Jackson (mapeamento JSON com records)


📡 Endpoints

MétodoEndpointDescriçãoGET/api/filmesLista os filmes popularesGET/api/filmes/buscar?nome={nome}Busca filmes pelo nome

Exemplo de requisição

httpGET /api/filmes/buscar?nome=matrix

Exemplo de resposta

json{
  "results": [
    {
      "id": 603,
      "title": "The Matrix",
      "original_title": "The Matrix",
      "overview": "Um hacker descobre a verdade sobre a realidade...",
      "release_date": "1999-03-31",
      "poster_path": "/f89U3ADr1oiB1s9GkdPOEpXUk5H.jpg",
      "vote_average": 8.2,
      "genre_ids": [28, 878]
    }
  ]
}

⚙️ Como executar

Pré-requisitos


Java 17 ou superior
Maven
Uma chave de API do TMDB (crie a sua aqui)


Passos


Clone o repositório:


bash   git clone https://github.com/seu-usuario/seu-repositorio.git
   cd seu-repositorio


Configure sua chave da API do TMDB no arquivo application.properties:


properties   tmdb.api.key=SUA_CHAVE_AQUI


Execute a aplicação:


bash   ./mvnw spring-boot:run


Acesse a documentação Swagger:


   http://localhost:8080/swagger-ui.html

🏗️ Estrutura do projeto

src/main/java/com/example/api/
├── ApiController.java   # Endpoints REST
├── ApiService.java      # Lógica de consumo da API do TMDB (WebClient)
├── ApiDto.java          # Record para mapear a resposta JSON
└── Config.java          # Configuração do bean WebClient.Builder

📖 Conceitos aplicados


RestClient vs WebClient: RestClient é síncrono (bloqueante), enquanto WebClient é assíncrono (não-bloqueante) — ideal para consumir APIs externas sem travar threads.
Mono vs Flux: Mono representa 0 ou 1 elemento; Flux representa 0 ou N elementos no fluxo reativo.


📄 Licença

Este projeto está sob a licença MIT. Sinta-se à vontade para usar e contribuir!


⭐ Se este projeto te ajudou, deixe uma estrela no repositório!
