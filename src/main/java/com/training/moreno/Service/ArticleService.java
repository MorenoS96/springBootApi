package com.training.moreno.Service;

import com.training.moreno.Model.Dto.ArticleDto;
import com.training.moreno.Model.Entity.Article;
import com.training.moreno.Repository.ArticleRepository;

import org.apache.commons.collections4.IteratorUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArticleService {

   ArticleRepository articleRepository;

    public ArticleService(ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    public boolean createArticle(String title, String abstract_, String content){
        Article article = new Article(title,abstract_,content);
        articleRepository.save(article);
        return true;
    }


    public List<Article> getArticleByTitle(){
        return null;
    }

    public List<ArticleDto> getAllArticles() {
        List<Article> articles=IteratorUtils.toList(articleRepository.findAll().iterator());
        return articles.stream().map(this::convertToDto).toList();

    }

    private ArticleDto convertToDto(Article article) {
        ArticleDto articleDto = new ArticleDto();
        articleDto.setTitle(article.getTitle());
        articleDto.setAbstract_(article.getAbstract_());
        articleDto.setContent(article.getContent());
        return articleDto;
    }

}
