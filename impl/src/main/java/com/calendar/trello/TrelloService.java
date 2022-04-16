package com.calendar.trello;


import com.calendar.trello.model.response.BoardServiceResponse;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

@Service
@AllArgsConstructor
public class TrelloService {

    public Flux<BoardServiceResponse> getBoard(){
        return null;
    }
}
