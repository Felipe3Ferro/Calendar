package com.calendar.controller.v1.trello.mapper.response;

import com.calendar.controller.v1.trello.model.response.BoardControllerResponse;
import com.calendar.controller.v1.trello.model.response.CardControllerResponse;
import com.calendar.controller.v1.trello.model.response.ListofBoardControllerResponse;
import com.calendar.trello.model.response.BoardServiceResponse;
import com.calendar.trello.model.response.CardServiceResponse;
import com.calendar.trello.model.response.ListofBoardServiceResponse;

import java.util.List;

public class BoardControllerResponseMapper {

    public static BoardControllerResponse toBoardControllerResponse(BoardServiceResponse boardServiceResponse) {
        return BoardControllerResponse.builder()
                .id(boardServiceResponse.getId())
                .name(boardServiceResponse.getName())
                .closed(boardServiceResponse.getClosed())
                .list(toListofBoardControllerResponse(boardServiceResponse.getList()))
                .build();
    }

    public static List<ListofBoardControllerResponse> toListofBoardControllerResponse(List<ListofBoardServiceResponse> listofBoardServiceResponse) {
        return listofBoardServiceResponse.stream()
                .map(varListofBoardServiceResponse ->
                        ListofBoardControllerResponse.builder()
                                .id(varListofBoardServiceResponse.getId())
                                .name(varListofBoardServiceResponse.getName())
                                .cardControllerResponses(toCardControllerResponse(varListofBoardServiceResponse.getCardServiceResponse()))
                                .build()
                )
                .toList();
    }

    public static List<CardControllerResponse> toCardControllerResponse(List<CardServiceResponse> cardServiceResponse) {
        return cardServiceResponse.stream()
                .map(varCardServiceResponse ->
                        CardControllerResponse.builder()
                                .id(varCardServiceResponse.getId())
                                .name(varCardServiceResponse.getName())
                                .desc(varCardServiceResponse.getDesc())
                                .build()
                )
                .toList();
    }
}
