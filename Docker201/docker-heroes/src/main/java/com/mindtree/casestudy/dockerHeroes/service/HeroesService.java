package com.mindtree.casestudy.dockerHeroes.service;

import com.mindtree.casestudy.dockerHeroes.entity.Hero;

import java.util.List;

public interface HeroesService {
    Hero add(Hero hero);

    List<Hero> getAll();

    Hero getHero(Integer id);
}
