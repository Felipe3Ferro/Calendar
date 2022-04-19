package com.calendar.trello.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListofBoardIntegrationResponse {
    private String id;
    private String name;
    private String desc;
    private List<CardIntegrationResponse> cardServiceResponse;
}