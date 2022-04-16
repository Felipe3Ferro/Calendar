package com.calendar.controller.v1.trello.facade;

import com.calendar.controller.v1.trello.mapper.response.BoardControllerResponseMapper;
import com.calendar.controller.v1.trello.model.response.BoardControllerResponse;
import com.calendar.trello.TrelloService;
import lombok.AllArgsConstructor;
import reactor.core.publisher.Flux;

@AllArgsConstructor
public class TrelloControllerFacade {

    private final TrelloService trelloService;

    public Flux<BoardControllerResponse> getBoardControllerFacade(){
        return trelloService.getBoard().map(BoardControllerResponseMapper::toBoardControllerResponse);
    }
}
