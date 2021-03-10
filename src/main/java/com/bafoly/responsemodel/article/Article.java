package com.bafoly.responsemodel.article;

import com.bafoly.responsemodel.user.User;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Article {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String title;
  private String content;

  @ManyToOne
  private User owner;
}
