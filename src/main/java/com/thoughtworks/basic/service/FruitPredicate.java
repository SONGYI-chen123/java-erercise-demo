package com.thoughtworks.basic.service;

import com.thoughtworks.basic.entity.Fruit;

public interface FruitPredicate {
    boolean test (Fruit fruit);
}
