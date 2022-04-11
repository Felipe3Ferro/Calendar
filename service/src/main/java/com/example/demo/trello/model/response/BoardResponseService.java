package com.example.demo.trello.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BoardResponseService {
    @NotNull
    private String id;
    @NotNull
    private String name;
    private Boolean closed;
    // private String desc;
    private List<ListofBoardResponseService> list;

}