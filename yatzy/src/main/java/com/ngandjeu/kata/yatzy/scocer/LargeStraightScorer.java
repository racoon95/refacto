package com.ngandjeu.kata.yatzy.scocer;

import java.util.List;
import java.util.Optional;

public class LargeStraightScorer  {

    private LargeStraightScorer() {
    }
    private static final int LARGE_STRAIGHT_FACE = 6;


    public static int calculateScore(List<Integer> rollDiceFaces) {
        return Optional.of(rollDiceFaces)
                .filter(LargeStraightScorer::isLargeStraight)
                .map(LargeStraightScorer::calculateSuccessScore)
                .orElse(0);
    }


    static boolean isLargeStraight(List<Integer> rollDiceFaces) {
        var frequenciesByFaceMap = DiceFaceFrequencyCalculator.computeDiceFacesFrequencies(rollDiceFaces);
        return Optional.of(frequenciesByFaceMap.get(LARGE_STRAIGHT_FACE))
                .filter(value -> value != 0)
                .stream()
                .findAny()
                .map(value -> frequenciesByFaceMap.values()
                        .stream()
                        .filter(face -> face == 1)
                        .toList()
                        .size() == rollDiceFaces.size())
                .orElse(false);

    }

    private static int calculateSuccessScore(List<Integer> rollDiceFaces) {
        return rollDiceFaces
                .stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
