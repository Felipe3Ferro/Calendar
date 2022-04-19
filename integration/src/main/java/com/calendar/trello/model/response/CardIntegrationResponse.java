package com.calendar.trello.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CardIntegrationResponse {
    private String id;
    private String name;
    private String desc;
}
