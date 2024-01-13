package com.training.moreno.Controller;

import com.training.moreno.Model.Dto.ArticleDto;
import com.training.moreno.Service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleController {
   @Autowired
    ArticleService articleService;
    @GetMapping("/articles/getAllArticles")
    public List<ArticleDto>getAllArticles(){
       return articleService.getAllArticles();
    }
    @PostMapping("/articles/create")
    public boolean saveArticle(String title,String abstract_, String content){
        return articleService.createArticle( title, abstract_,  content);
    }
}
