package com.bafoly.responsemodel.article;

import lombok.Data;

@Data
public class ArticleDTO {

  private String title;
  private String content;

  public ArticleDTO(Article article){
    this.setTitle(article.getTitle());
    this.setContent(article.getContent());
  }
}
