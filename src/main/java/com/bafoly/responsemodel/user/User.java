package com.bafoly.responsemodel.user;

import javax.persistence.*;

import com.bafoly.responsemodel.article.Article;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)

//  @JsonView(View.Admin.class)
  private long id;

//  @JsonView(View.Base.class)
  private String username;

  private String firstName;

  private String LastName;

//  @JsonView(View.Base.class)
  private String email;

  private String password;

  @OneToMany(mappedBy = "owner")
  private List<Article> articles = new ArrayList<Article>();
  
}
