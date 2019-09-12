
package com.vote.repository;
import com.vote.entity.VoteType;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public
interface VoteTypeRepository extends JpaRepository<VoteType, Long> {
    
}