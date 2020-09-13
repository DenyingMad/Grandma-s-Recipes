package com.devilpanda.Grandma.s.Recipes.Service;

import com.devilpanda.Grandma.s.Recipes.Entity.TestRecipe;
import com.devilpanda.Grandma.s.Recipes.Repository.TestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    public TestRepository repository;

    public TestRecipe getInfo(){
        return repository.findById(1L).orElse(new TestRecipe());
    }
}
