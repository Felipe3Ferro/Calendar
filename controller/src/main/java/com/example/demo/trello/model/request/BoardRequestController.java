package com.example.demo.trello.model.request;

import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class BoardRequestController {
    @NotNull
    private String id;
    @NotNull
    private String name;
    private Boolean closed;
    // private String desc;
    private List<ListofBoardRequestService> list;

}