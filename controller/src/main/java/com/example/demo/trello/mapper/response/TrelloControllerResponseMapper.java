package com.example.demo.trello.mapper.response;

import com.example.demo.trello.model.response.BoardResponseController;
import com.example.demo.trello.model.response.BoardResponseService;

public class TrelloControllerResponseMapper {

    public static BoardResponseController mapToGetResponse(BoardResponseService boardResponseService){

        return BoardResponseController.builder()
                .id(boardResponseService.getId())
                .name(boardResponseService.getName())
                .closed(boardResponseService.getClosed())
                .build();
    }
}
