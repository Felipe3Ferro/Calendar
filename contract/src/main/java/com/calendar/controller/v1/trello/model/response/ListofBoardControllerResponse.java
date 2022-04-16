package com.calendar.controller.v1.trello.model.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ListofBoardControllerResponse {
    private String id;
    private String name;
    private String desc;
    private List<CardControllerResponse> cardControllerResponses;
}