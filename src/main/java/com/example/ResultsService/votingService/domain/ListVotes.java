package com.example.ResultsService.votingService.domain;

import com.example.ResultsService.votingService.dto.ListVotesDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
class ListVotes {
    private Long listId;
    private Long votes;

    public ListVotesDto toDto() {
        return new ListVotesDto(listId, votes);
    }
}