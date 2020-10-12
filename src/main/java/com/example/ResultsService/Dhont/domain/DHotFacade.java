package com.example.ResultsService.Dhont.domain;

import com.example.ResultsService.Dhont.dto.DHontResultsDto;
import com.example.ResultsService.votingService.dto.VotingStatsDto;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;


@Component
@AllArgsConstructor
public class DHotFacade {

    private DHontCalculator calculator;

    public DHontResultsDto DHontSeats(VotingStatsDto dto) {
        return calculator.calculate(dto);
    }
}
