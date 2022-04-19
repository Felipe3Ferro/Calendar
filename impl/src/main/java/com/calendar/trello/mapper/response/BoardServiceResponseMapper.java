package com.calendar.trello.mapper.response;

import com.calendar.trello.model.response.*;

import java.util.List;

public class BoardServiceResponseMapper {

    public static BoardServiceResponse toBoardServiceResponse(BoardIntegrationResponse BoardIntegrationResponse) {
        return BoardServiceResponse.builder()
                .id(BoardIntegrationResponse.getId())
                .name(BoardIntegrationResponse.getName())
                .closed(BoardIntegrationResponse.getClosed())
                .list(toListofBoardServiceResponse(BoardIntegrationResponse.getList()))
                .build();
    }

    public static List<ListofBoardServiceResponse> toListofBoardServiceResponse(List<ListofBoardIntegrationResponse> listofBoardIntegrationResponse) {
        return listofBoardIntegrationResponse.stream()
                .map(varListofBoardIntegrationResponse ->
                        ListofBoardServiceResponse.builder()
                                .id(varListofBoardIntegrationResponse.getId())
                                .name(varListofBoardIntegrationResponse.getName())
                                .desc(varListofBoardIntegrationResponse.getDesc())
                                .cardServiceResponse(toCardServiceResponse(varListofBoardIntegrationResponse.getCardServiceResponse()))
                                .build()
                )
                .toList();
    }

    public static List<CardServiceResponse> toCardServiceResponse(List<CardIntegrationResponse> cardIntegrationResponses) {
        return cardIntegrationResponses.stream()
                .map(varCardIntegrationResponse ->
                        CardServiceResponse.builder()
                                .id(varCardIntegrationResponse.getId())
                                .name(varCardIntegrationResponse.getName())
                                .desc(varCardIntegrationResponse.getDesc())
                                .build()
                )
                .toList();
    }
}
