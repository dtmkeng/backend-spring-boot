
package com.vote.repository;
import com.vote.entity.Competitor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public
interface CompetitorRepository extends JpaRepository<Competitor, Long> {
    
}