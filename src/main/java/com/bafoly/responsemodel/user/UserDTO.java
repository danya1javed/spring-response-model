package com.bafoly.responsemodel.user;

import com.bafoly.responsemodel.article.ArticleDTO;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserDTO {

  private String fullName;
  private String username;
  private String email;
  private List<ArticleDTO> articles = new ArrayList<>();
  private int articleCount;

  public UserDTO(User user){
    this.setUsername(user.getUsername());
    this.setFullName(user.getFirstName() + "-" + user.getLastName());
    this.setEmail(user.getEmail());
    this.setArticleCount(user.getArticles().size());
    user.getArticles().stream().forEach(ar -> {
      this.articles.add(new ArticleDTO(ar));
    });
  }

}
