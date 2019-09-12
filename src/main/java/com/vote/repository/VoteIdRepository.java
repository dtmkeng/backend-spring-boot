
package com.vote.repository;
import com.vote.entity.VoteId;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public
interface VoteIdRepository extends JpaRepository<VoteId, Long> {
    
}