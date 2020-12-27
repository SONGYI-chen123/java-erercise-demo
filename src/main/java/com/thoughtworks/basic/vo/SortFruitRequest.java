package com.thoughtworks.basic.vo;

import com.thoughtworks.basic.enumeration.FruitType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SortFruitRequest {
    private FruitType fruitType;

    private String color;

    private Integer weight;
}
