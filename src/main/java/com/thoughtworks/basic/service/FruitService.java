package com.thoughtworks.basic.service;

import com.thoughtworks.basic.entity.Fruit;
import com.thoughtworks.basic.enumeration.FruitType;
import com.thoughtworks.basic.repository.FruitRepository;
import org.springframework.stereotype.Service;

import java.util.List;;
import java.util.stream.Collectors;

@Service
public class FruitService {
    private final FruitRepository fruitRepository;

    public FruitService(FruitRepository fruitRepository) {
        this.fruitRepository = fruitRepository;
    }

    public List<Fruit> sortFruit() {
        List<Fruit> fruits = fruitRepository.findAll();
        return filterFruit(fruits, new FruitRedAndHeavyPredicate());
    }

    public static List<Fruit> filterFruit(List<Fruit> fruits, FruitPredicate p) {
        return fruits.stream().filter(fruit -> Boolean.TRUE.equals(p.test(fruit))).collect(Collectors.toList());
    }
}

class FruitRedAndHeavyPredicate implements FruitPredicate {
    public boolean test(Fruit fruit) {
        return "RED".equals(fruit.getColor())
                && fruit.getWeight() > 150
                && FruitType.APPLE.equals(fruit.getFruitType());
    }


}
