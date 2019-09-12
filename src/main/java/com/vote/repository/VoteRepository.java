
package com.vote.repository;
import com.vote.entity.Vote;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public
interface VoteRepository extends JpaRepository<Vote, Long> {
    
}