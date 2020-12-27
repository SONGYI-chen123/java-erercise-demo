package com.thoughtworks.basic.repository;

import com.thoughtworks.basic.entity.Fruit;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FruitRepository extends CrudRepository<Fruit, String> {
    @Override
    List<Fruit> findAll();
}
