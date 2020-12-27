package com.thoughtworks.basic.entity;

import com.thoughtworks.basic.enumeration.FruitType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;

@Getter
@Setter
@SuperBuilder
@Table(name = "fruit_info")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Fruit {
    @Enumerated(EnumType.STRING)
    private FruitType fruitType;

    private String color;

    private Integer weight;
}
