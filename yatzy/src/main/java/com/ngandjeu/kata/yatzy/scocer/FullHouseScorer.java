package com.ngandjeu.kata.yatzy.scocer;

import java.util.List;
import java.util.Map;
import java.util.Optional;

public class FullHouseScorer {

    static final int TWO_OF_A_KIND_OCCURRENCE = 2;
    static final int THREE_OF_A_KIND_OCCURRENCE = 3;
    private FullHouseScorer() {
    }

    public static int calculateScore(List<Integer> rollDiceFaces) {
        var frequenciesByFaceMap = DiceFaceFrequencyCalculator.computeDiceFacesFrequencies(rollDiceFaces);
        return Optional.of(rollDiceFaces)
                .filter(faces -> isFullHouseScorer(frequenciesByFaceMap))
                .map(FullHouseScorer::calculateSuccessScore)
                .orElse(0);
    }

    private static boolean isFullHouseScorer(Map<Integer, Integer> frequenciesByFaceMap) {
        return frequenciesByFaceMap.containsValue(TWO_OF_A_KIND_OCCURRENCE) && frequenciesByFaceMap.containsValue(THREE_OF_A_KIND_OCCURRENCE);
    }

    private static int calculateSuccessScore(List<Integer> rollDiceFaces) {
        return rollDiceFaces.stream()
                .mapToInt(Integer::intValue)
                .sum();
    }
}
