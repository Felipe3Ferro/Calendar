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
public class BoardServiceResponse {
    private String id;
    private String name;
    private Boolean closed;
    // private String desc;
    private List<ListofBoardServiceResponse> list;

}