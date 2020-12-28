package com.thoughtworks.basic.entity;

import com.thoughtworks.basic.enumeration.FruitType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.*;

@Getter
@Setter
@SuperBuilder
@Table(name = "fruit_info")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Fruit {
    @Id
    private String id;

    @Enumerated(EnumType.STRING)
    private FruitType fruitType;

    private String color;

    private Integer weight;

}
