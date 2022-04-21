package com.calendar.trello.model.response;

import com.fasterxml.jackson.annotation.JsonProperty;
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
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    private List<CardIntegrationResponse> cardIntegrationResponses;
}