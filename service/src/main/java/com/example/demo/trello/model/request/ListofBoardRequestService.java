package com.example.demo.trello.model.request;

import lombok.Data;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class ListofBoardRequestService {
    private String id;
    private String name;
    private String desc;
    private List<CardRequestService> cards;
}
