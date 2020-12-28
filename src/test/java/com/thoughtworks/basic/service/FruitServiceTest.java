package com.thoughtworks.basic.service;

import com.thoughtworks.basic.entity.Fruit;
import com.thoughtworks.basic.enumeration.FruitType;
import com.thoughtworks.basic.repository.FruitRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class FruitServiceTest {
    @Mock
    FruitRepository fruitRepository;

    private FruitService fruitService;

    List<Fruit> fruits = new ArrayList<>();

    @Before
    public void setUp(){
        fruits.add(Fruit.builder().fruitType(FruitType.APPLE).color("GREEN").weight(160).build());
        fruits.add(Fruit.builder().fruitType(FruitType.APPLE).color("RED").weight(160).build());
        fruits.add(Fruit.builder().fruitType(FruitType.APPLE).color("RED").weight(100).build());

        fruitService = new FruitService(fruitRepository);
    }

    @Test
    public void should_sort_fruit_success(){
        when(fruitRepository.findAll()).thenReturn(fruits);
        List<Fruit> result = fruitService.sortFruit();

        assertEquals(1,result.size());
        assertThat("RED".equals(result.get(0).getColor()));
    }
}
