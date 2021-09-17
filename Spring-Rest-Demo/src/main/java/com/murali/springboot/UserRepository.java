package com.murali.springboot;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * @author:Sanapala Muralidharan
 * @date:Sep 17, 2021 12:21:14 PM
 * @version:2.x
 */

@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends PagingAndSortingRepository<ApplicationUser, Integer> {

    public ApplicationUser findByEmail(@Param("email") String email);
}
