package com.calendar.trello.model.response;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class ListofBoardServiceResponse {
    private String id;
    private String name;
    private String desc;
    private List<CardServiceResponse> cardServiceResponse;
}