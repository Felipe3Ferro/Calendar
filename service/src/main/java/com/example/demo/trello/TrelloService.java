package com.example.demo.trello;

import com.example.demo.trello.model.response.BoardResponseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@AllArgsConstructor
public class TrelloService {

    public BoardResponseService getBoard(){

        return BoardResponseService.builder()
                .id("12314")
                .name("Name")
                .closed(true)
                .build();
    }
}
