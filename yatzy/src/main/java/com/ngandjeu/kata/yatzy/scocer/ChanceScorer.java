package com.ngandjeu.kata.yatzy.scocer;

import java.util.List;

public class ChanceScorer {
    private ChanceScorer() {
    }
    public static int calculateScore(List<Integer> rollDiceFaces) {
        return rollDiceFaces.stream().mapToInt(Integer::intValue).sum();
    }
}
