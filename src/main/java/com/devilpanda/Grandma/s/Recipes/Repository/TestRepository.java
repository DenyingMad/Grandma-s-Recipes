package com.devilpanda.Grandma.s.Recipes.Repository;

import com.devilpanda.Grandma.s.Recipes.Entity.TestRecipe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestRepository extends JpaRepository<TestRecipe, Integer> {
}
