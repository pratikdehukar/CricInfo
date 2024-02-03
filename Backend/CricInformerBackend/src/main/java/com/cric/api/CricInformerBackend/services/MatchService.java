package com.cric.api.CricInformerBackend.services;


import com.cric.api.CricInformerBackend.entities.Match;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MatchService {

    List<Match> getAllMatches();

    List<Match> getLiveMatches();


}
