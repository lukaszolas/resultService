package com.example.ResultsService.votingService.domain;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Component
@AllArgsConstructor
class VotingServiceClient {
    private RestTemplate restTemplate;

    VotingStats getVotingData(Long votingId) {
        List<ListVotes> votes = new ArrayList<>();
        votes.add(new ListVotes(1L, 500L));
        votes.add(new ListVotes(2L, 340L));
        votes.add(new ListVotes(3L, 180L));
        return new VotingStats(votingId, votes);
    }
}
