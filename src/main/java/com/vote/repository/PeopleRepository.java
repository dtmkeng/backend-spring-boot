
package com.vote.repository;
import com.vote.entity.People;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public
interface PeopleRepository extends JpaRepository<People, Long> {
    
}