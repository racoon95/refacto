package com.ngandjeu.kata.yatzy.scocer;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class ThreeOfAKindScorer {

    private ThreeOfAKindScorer() {
    }
    private static final int FACE_OCCURRENCE = 3;
    public static int calculateScore(List<Integer> rollDiceFaces) {
        var frequenciesByFaceMap = DiceFaceFrequencyCalculator.computeDiceFacesFrequencies(rollDiceFaces);
        return frequenciesByFaceMap.keySet().stream()
                .sorted(Comparator.reverseOrder())
                .filter(face -> isFaceOccurredMinimumThreeTimes(face, frequenciesByFaceMap))
                .findFirst()
                .map(face ->  face * FACE_OCCURRENCE)
                .orElse(0);
    }

    private static boolean isFaceOccurredMinimumThreeTimes(Integer face, Map<Integer, Integer> frequenciesByFaceMap) {
        return frequenciesByFaceMap.get(face) >= FACE_OCCURRENCE;
    }
}
