package com.example.demo.trello.model.response;

import lombok.Data;

import java.util.List;

@Data
public class ListofBoardResponseController {
    private String id;
    private String name;
    private String desc;
    private List<CardResponseController> cards;
}
