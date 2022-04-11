package com.example.demo.trello;

import com.example.demo.trello.facade.ControllerFacade;
import com.example.demo.trello.model.response.BoardResponseController;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@AllArgsConstructor
@RestController
@RequestMapping("/v1/trello")
public class TrelloController {

    private final ControllerFacade controllerFacade;

//     @GetMapping("{id}/cards")
//     public List getCards(@PathVariable String id) {
//     return trelloService.getCardsByBoardId(id);
//     }

    @GetMapping("/board")
    public BoardResponseController getBoard() {
        return controllerFacade.getBoard();
    }

//    @PostMapping("/board")
//    public BoardResponseController createBoard(@RequestBody BoardResponseService board) {
//        return trelloService.createBoard(board);
//    }
//
//    @PostMapping("/card/{boardId}/{listofBoardId}")
//    public CardResponseController createCard(@RequestBody CardRequestController card, @PathVariable String boardId, @PathVariable String listofBoardId) {
//        return trelloService.createCard(card, boardId, listofBoardId);
//    }
//
//    @DeleteMapping
//    public void deleteBoard(){
//        trelloService.deleteAll();
//    }
//
//    @DeleteMapping("/{id}")
//    public void deleteBoard(@PathVariable String id){
//        trelloService.deleteBoard(id);
//    }

}