
package com.vote.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.vote.repository.*;
import com.vote.entity.*;
import com.vote.model.*;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin(origins = "http://localhost:8080")
@RestController
public class VoteController {

    @Autowired
    private final VoteRepository  voteRepository;

    public VoteController(VoteRepository  voteRepository) {
            this.voteRepository = voteRepository;
    }
    @PostMapping("/request")
    public BodyVote index(@RequestBody BodyVote bodyVote) {
        System.out.println(bodyVote.getUsername());
        System.out.println(bodyVote.getPassword());
		return bodyVote;
	}
}