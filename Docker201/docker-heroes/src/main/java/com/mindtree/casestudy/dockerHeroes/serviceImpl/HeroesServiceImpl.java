package com.mindtree.casestudy.dockerHeroes.serviceImpl;

import com.mindtree.casestudy.dockerHeroes.entity.Hero;
import com.mindtree.casestudy.dockerHeroes.repo.HeroesRepo;
import com.mindtree.casestudy.dockerHeroes.service.HeroesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class HeroesServiceImpl implements HeroesService {

    @Autowired
    HeroesRepo repo;
    @Override
    public Hero add(Hero hero) {
        Hero obj = repo.save(hero);
        return obj;
    }

    @Override
    public List<Hero> getAll() {
         List<Hero> list = repo.findAll();
         return list;
    }

    @Override
    public Hero getHero(Integer id) {
        Hero obj = repo.getOne(id);
        return obj;
    }
}
