package com.ngandjeu.kata.yatzy.scocer;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class SmallStraightScorer {

    private static final int SMALL_STRAIGHT_FACE = 1;

    private SmallStraightScorer() {
    }

    public static int calculateScore(List<Integer> rollDiceFaces) {
        return Optional.of(rollDiceFaces)
                .filter(SmallStraightScorer::isSmallStraight)
                .map(SmallStraightScorer::calculateSuccessScore)
                .orElse(0);
    }


    private static boolean isSmallStraight(List<Integer> rollDiceFaces) {
        var frequenciesByFaceMap = DiceFaceFrequencyCalculator.computeDiceFacesFrequencies(rollDiceFaces);
        return Optional.of(frequenciesByFaceMap.get(SMALL_STRAIGHT_FACE))
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
