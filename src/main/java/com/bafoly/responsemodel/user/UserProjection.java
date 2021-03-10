package com.bafoly.responsemodel.user;

import com.bafoly.responsemodel.article.ArticleProjection;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public interface UserProjection {

  @Value("#{target.firstName + ' ' + target.lastName}")
  String getFullName();
  String getUsername();
  String getEmail();
  @Value(("#{target.articles.size()}"))
  int getArticleCount();

//  List<ArticleProjection> getArticles();

}
