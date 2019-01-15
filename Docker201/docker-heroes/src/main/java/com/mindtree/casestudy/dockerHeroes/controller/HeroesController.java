package com.mindtree.casestudy.dockerHeroes.controller;

import com.mindtree.casestudy.dockerHeroes.entity.Hero;
import com.mindtree.casestudy.dockerHeroes.service.HeroesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class HeroesController {
    @Autowired
    HeroesService service;

    @PostMapping("/hero/add")
    public Hero addHero(@RequestBody Hero hero) {
        Hero obj = service.add(hero);
        return obj;
    }

    @GetMapping("/hero/all")
    public List<Hero> getAllHero() {
        List<Hero> heroes = service.getAll();
        return heroes;
    }

    @GetMapping("/hero/{id}")
    public Hero getHero(@PathVariable Integer id) {
        Hero hero = service.getHero(id);
        return hero;
    }

    @GetMapping("/hero/test/v1")
    public String test() {
        return "Success";
    }
}
