package com.bafoly.responsemodel.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class UserService {

  @Autowired
  UserRepository userRepository;

	public List<UserProjection> getUsersWithProjection() {
	  return userRepository.findAllProjection();
	}

	public Page<User> getUsers(Pageable pageable) { return  userRepository.findAll(pageable);}
  
}
