package com.calendar.controller.v1.trello;

import com.calendar.controller.v1.trello.facade.TrelloControllerFacade;
import com.calendar.controller.v1.trello.model.response.BoardControllerResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
@AllArgsConstructor
@RequestMapping("/v1/trello")
public class TrelloController {

    private final TrelloControllerFacade trelloControllerFacade;

    @GetMapping("/board")
    public Flux<BoardControllerResponse> getBoard() {
        return trelloControllerFacade.getBoardControllerFacade();
    }

}
