package com.devilpanda.Grandma.s.Recipes.Entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "ingredients")
public class RecipeIngredients {
    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private int id;

    @Column(name = "ingredient")
    private String ingredient;

    @Column(name = "amount")
    private String amount;

}
