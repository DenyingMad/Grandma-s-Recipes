package com.devilpanda.Grandma.s.Recipes.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "ingredients")
public class RecipeIngredients {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long ingredientId;

    @Column(name = "ingredient")
    private String ingredient;

    @Column(name = "amount")
    private String amount;

    @ManyToOne
    @JoinColumn(name = "recipe_id", nullable = false)
    @JsonBackReference
    private TestRecipe recipe;

    public long getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(long id) {
        this.ingredientId = id;
    }

    public String getIngredient() {
        return ingredient;
    }

    public void setIngredient(String ingredient) {
        this.ingredient = ingredient;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public TestRecipe getRecipe() {
        return recipe;
    }

    public void setRecipe(TestRecipe recipe) {
        this.recipe = recipe;
    }

}
