package com.min.project.portal.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.min.project.portal.model.UserDetailsModel;

@Repository
public interface UserDetailsRepo extends CrudRepository<UserDetailsModel, Integer> {

  UserDetailsModel findByUserName(String userName);

}
