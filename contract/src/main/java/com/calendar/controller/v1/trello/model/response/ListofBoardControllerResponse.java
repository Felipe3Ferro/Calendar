package com.calendar.controller.v1.trello.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListofBoardControllerResponse {
    private String id;
    private String name;
    private List<CardControllerResponse> cardControllerResponses;
}