package com.calendar.trello;

import com.calendar.trello.model.response.BoardIntegrationResponse;
import com.calendar.trello.model.response.CardIntegrationResponse;
import com.calendar.trello.model.response.ListofBoardIntegrationResponse;
import lombok.AllArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
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
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/1/members/me/boards")
                        .queryParam("key", "4d22d21f5c6e14648a954f215c23a55f")
                        .queryParam("token", "348302ac70e0e10c33a0d89ebaee4194609f992f422c13bb30d70531718efba3")
                        .build())
                .retrieve()
                .bodyToFlux(BoardIntegrationResponse.class);
    }

    public Flux<BoardIntegrationResponse> getBoard2() {

        List<BoardIntegrationResponse> listOfBoard = webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("/1/members/me/boards")
                        .queryParam("key", "4d22d21f5c6e14648a954f215c23a55f")
                        .queryParam("token", "348302ac70e0e10c33a0d89ebaee4194609f992f422c13bb30d70531718efba3")
                        .build())
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<BoardIntegrationResponse>>() {})
                .block();

        listOfBoard.stream().forEach(varOfBoard -> varOfBoard.setList(getListofBoard(varOfBoard.getId())));


        return Mono.just(listOfBoard)
                .flatMapIterable(list -> list);

    }

    public List<ListofBoardIntegrationResponse> getListofBoard(String boardId){
        List<ListofBoardIntegrationResponse> listOfBoard = webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("1/boards/" + boardId + "/lists")
                        .queryParam("key", "4d22d21f5c6e14648a954f215c23a55f")
                        .queryParam("token", "348302ac70e0e10c33a0d89ebaee4194609f992f422c13bb30d70531718efba3")
                        .build())
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<ListofBoardIntegrationResponse>>() {})
                .block();

        listOfBoard.stream().forEach(varListOfBoard -> varListOfBoard.setCardIntegrationResponses(getCards(boardId)));

        return listOfBoard;
    }

    private List<CardIntegrationResponse> getCards(String boardId) {
        return webClient.get()
                .uri(uriBuilder -> uriBuilder
                        .path("1/boards/" + boardId + "/cards")
                        .queryParam("key", "4d22d21f5c6e14648a954f215c23a55f")
                        .queryParam("token", "348302ac70e0e10c33a0d89ebaee4194609f992f422c13bb30d70531718efba3")
                        .build())
                .retrieve()
                .bodyToMono(new ParameterizedTypeReference<List<CardIntegrationResponse>>() {})
                .block();
    }

}
