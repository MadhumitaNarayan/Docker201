package com.mindtree.casestudy.dockerHeroes.repo;

import com.mindtree.casestudy.dockerHeroes.entity.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroesRepo extends JpaRepository<Hero,Integer> {
}
