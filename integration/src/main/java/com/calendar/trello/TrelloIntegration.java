package com.calendar.trello;

import com.calendar.trello.model.response.BoardIdIntegrationResponse;
import com.calendar.trello.model.response.BoardIntegrationResponse;
import com.calendar.trello.model.response.CardIntegrationResponse;
import com.calendar.trello.model.response.ListofBoardIntegrationResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@Component
@AllArgsConstructor
public class TrelloIntegration {

    private final WebClient webClient;

    public Flux<BoardIntegrationResponse> getBoard() {
        Mono<BoardIdIntegrationResponse> a = webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/1/members/me/boards")
                        .queryParam("key", "4d22d21f5c6e14648a954f215c23a55f")
                        .queryParam("token", "348302ac70e0e10c33a0d89ebaee4194609f992f422c13bb30d70531718efba3")
                        .build())
                .retrieve()
                .bodyToMono(BoardIdIntegrationResponse.class);

        System.out.println(a.block().getIdentifs().toString());

        return  Flux.just(BoardIntegrationResponse.builder()
                .id("123")
                .name("name")
                .closed(true)
                .list(List.of(ListofBoardIntegrationResponse.builder()
                        .cardServiceResponse(List.of(CardIntegrationResponse.builder().build()))
                        .build()))
                .build());
    }

}
