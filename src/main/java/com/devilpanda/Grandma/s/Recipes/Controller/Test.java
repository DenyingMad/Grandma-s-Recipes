package com.devilpanda.Grandma.s.Recipes.Controller;

import com.devilpanda.Grandma.s.Recipes.Entity.TestRecipe;
import com.devilpanda.Grandma.s.Recipes.Service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/")
public class Test {

    @Autowired
    private TestService service;

    @RequestMapping(value = "func")
    public @ResponseBody
    String testFunc(){
        return "Server is working!";
    }

    @RequestMapping(value = "test")
    public @ResponseBody
    TestRecipe getTestInfo(){
        return service.getInfo();
    }
}
