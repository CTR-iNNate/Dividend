package com.example.dividend.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data // Getter Setter NoArg ToString Require
@Builder
@AllArgsConstructor
public class Company {

    private String ticker;
    private String name;

}
