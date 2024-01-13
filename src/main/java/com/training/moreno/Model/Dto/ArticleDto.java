package com.training.moreno.Model.Dto;


public class ArticleDto {
    private Long id;
    private String title;
    private String abstract_;
    private String content;

    // Constructors, getters, setters...

    // Constructors
    public ArticleDto() {
    }

    public ArticleDto(Long id, String title, String abstract_, String content) {
        this.id = id;
        this.title = title;
        this.abstract_ = abstract_;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAbstract_() {
        return abstract_;
    }

    public void setAbstract_(String abstract_) {
        this.abstract_ = abstract_;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
