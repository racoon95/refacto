package com.ngandjeu.kata.yatzy.scocer;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class FourOfAKindScorer {

    private static final int FACE_OCCURRENCE = 4;

    private FourOfAKindScorer() {
    }

    public static int calculateScore(List<Integer> rollDiceFaces) {
        var frequenciesByFaceMap  = DiceFaceFrequencyCalculator.computeDiceFacesFrequencies(rollDiceFaces);
        return frequenciesByFaceMap.keySet().stream()
                .sorted(Comparator.reverseOrder())
                .filter(face -> isFaceOccurredMinimumFourTimes(face, frequenciesByFaceMap))
                .findFirst()
                .map(face -> face * FACE_OCCURRENCE)
                .orElse(0);
    }

    private static boolean isFaceOccurredMinimumFourTimes(Integer face, Map<Integer, Integer> frequenciesByFaceMap) {
        return frequenciesByFaceMap.get(face) >= FACE_OCCURRENCE;
    }
}
