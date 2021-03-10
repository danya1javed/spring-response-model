package com.bafoly.responsemodel.user;

import java.util.List;
import java.util.stream.Collectors;

import com.fasterxml.jackson.annotation.JsonView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

  @Autowired
  UserService userService;

  @GetMapping("/api/1.0/users-projection")
//  @JsonView(View.Admin.class)
  List<UserProjection> getUsersWithProjection(){
    return userService.getUsersWithProjection();
  }

  @GetMapping("/api/1.0/users-dto")
//  @JsonView(View.Admin.class)
  Page<UserDTO> getUsersWithDTO(Pageable pageable){
    return userService.getUsers(pageable).map(UserDTO::new);
  }
}
