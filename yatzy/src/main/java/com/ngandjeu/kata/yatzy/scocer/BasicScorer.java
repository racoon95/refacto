package com.ngandjeu.kata.yatzy.scocer;

import java.util.List;

public class BasicScorer {

    protected static int calculateScore(List<Integer> rollDiceFaces) {
        return sumDiceFaces (rollDiceFaces);
    }

    protected static int sumDiceFaces(List<Integer> rollDiceFaces){
        return rollDiceFaces.stream().mapToInt(Integer::intValue).sum();
    }
}
