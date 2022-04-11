package com.example.demo.trello.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class ListofBoardResponseService {
    private String id;
    private String name;
    private String desc;
    private List<CardResponseService> cards;
}
