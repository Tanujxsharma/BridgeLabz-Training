package com.greeting.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Greeting {
    private int id;
    private String name ;
    private String message;
}
