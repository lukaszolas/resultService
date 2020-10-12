package com.example.ResultsService.Api;

import com.example.ResultsService.Dhont.domain.DHotFacade;
import com.example.ResultsService.Dhont.dto.DHontResultsDto;
import com.example.ResultsService.votingService.domain.VotingServiceFacade;
import com.example.ResultsService.votingService.dto.VotingStatsDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


import java.util.stream.Collectors;

@RestController
@AllArgsConstructor
class ResultsController {

    private final DHotFacade resultsFacade;
    private final VotingServiceFacade serviceFacade;

    @GetMapping("/results/{id}")
    VotingResultsResponse get(@PathVariable Long id) {
        VotingStatsDto votingResults = serviceFacade.getVotingResults(id);
        DHontResultsDto dHontResultsDto = resultsFacade.DHontSeats(votingResults);

        return new VotingResultsResponse(dHontResultsDto.getResults()
                .stream()
                .map(x -> new VotingResult(x.getListId(),x.getSeats()))
                .collect(Collectors.toList()));
    }
}