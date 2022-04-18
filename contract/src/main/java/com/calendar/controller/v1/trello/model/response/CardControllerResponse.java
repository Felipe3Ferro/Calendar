package com.calendar.controller.v1.trello.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardControllerResponse {
    private String id;
    private String name;
    private String desc;
}
