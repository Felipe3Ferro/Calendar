package com.example.demo.trello.facade;

import com.example.demo.trello.TrelloService;
import com.example.demo.trello.mapper.response.TrelloControllerResponseMapper;
import com.example.demo.trello.model.response.BoardResponseController;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ControllerFacade {

    private final TrelloService trelloService;

    public BoardResponseController getBoard(){
        return TrelloControllerResponseMapper.mapToGetResponse(trelloService.getBoard());
    }
}
