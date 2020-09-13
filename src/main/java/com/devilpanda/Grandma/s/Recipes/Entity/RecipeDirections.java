package com.devilpanda.Grandma.s.Recipes.Entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "directions")
public class RecipeDirections {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    private long directionId;

    @Column(name = "step_number", nullable = false)
    private int stepNumber;

    @Column(name = "header")
    private String header;

    @Column(name = "text", nullable = false)
    private String text;

    //todo refactor for images array
    @Column(name = "image")
    private String image;

    @ManyToOne
    @JoinColumn(name = "recipe_id", nullable = false)
    @JsonBackReference
    private TestRecipe recipe;

    public long getDirectionId() {
        return directionId;
    }

    public void setDirectionId(long directionId) {
        this.directionId = directionId;
    }

    public int getStepNumber() {
        return stepNumber;
    }

    public void setStepNumber(int stepNumber) {
        this.stepNumber = stepNumber;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public TestRecipe getRecipe() {
        return recipe;
    }

    public void setRecipe(TestRecipe recipe) {
        this.recipe = recipe;
    }
}
