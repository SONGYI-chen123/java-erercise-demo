package com.thoughtworks.basic.api;

import com.thoughtworks.basic.entity.Fruit;
import com.thoughtworks.basic.service.FruitService;
import com.thoughtworks.basic.vo.SortFruitRequest;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/fruit")
@AllArgsConstructor
public class FruitController {
    private final FruitService fruitService;

    @PostMapping("/sort")
    public void sortFruit(@RequestBody SortFruitRequest request){
        List<Fruit> fruits = fruitService.sortFruit();
    }
}
