package com.example.ResultsService.votingService.domain;

import com.example.ResultsService.votingService.dto.VotingStatsDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class VotingServiceFacade {
    private VotingServiceClient service;

    public VotingStatsDto getVotingResults(Long votingId) {

        return service.getVotingData(votingId).toDto();
    }

}
