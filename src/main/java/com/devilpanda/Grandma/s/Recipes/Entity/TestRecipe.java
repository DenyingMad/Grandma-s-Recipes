package com.devilpanda.Grandma.s.Recipes.Entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "recipe")
public class TestRecipe {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long recipeId;

    @Column(name = "name")
    private String recipeName;

    @Column(name = "description")
    private String recipeDescription;

    @OneToMany(mappedBy = "recipe")
    @JsonManagedReference
    private Set<RecipeIngredients> ingredients;

    @OneToMany(mappedBy = "recipe")
    @JsonManagedReference
    private Set<RecipeDirections> directions;

    public long getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(long id) {
        this.recipeId = id;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String testInfo) {
        this.recipeName = testInfo;
    }

    public String getRecipeDescription() {
        return recipeDescription;
    }

    public void setRecipeDescription(String recipeDescription) {
        this.recipeDescription = recipeDescription;
    }

    public Set<RecipeIngredients> getIngredients() {
        return ingredients;
    }

    public void setIngredients(Set<RecipeIngredients> ingredients) {
        this.ingredients = ingredients;
    }
}
