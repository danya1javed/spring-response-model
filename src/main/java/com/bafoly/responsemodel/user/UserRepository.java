package com.bafoly.responsemodel.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long>{

  @Query(
          value = "SELECT u from User u"
  )
  List<UserProjection> findAllProjection();
  
}
