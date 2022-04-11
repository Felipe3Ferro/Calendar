package com.example.demo.trello.model.request;

import lombok.Data;

import java.util.List;

@Data
public class ListofBoardRequestController {
    private String id;
    private String name;
    private String desc;
    private List<CardRequestController> cards;
}
