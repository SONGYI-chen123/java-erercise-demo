package com.thoughtworks.basic.repository;

import com.thoughtworks.basic.entity.Fruit;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface FruitRepository extends CrudRepository<Fruit, String> {
    List<Fruit> findAll();
}
