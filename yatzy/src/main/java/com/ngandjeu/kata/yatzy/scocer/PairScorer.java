package com.ngandjeu.kata.yatzy.scocer;

import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class PairScorer {

    private PairScorer() {
    }
    private static final int FACE_OCCURRENCE = 2;
    public static int calculateScore(List<Integer> rollDiceFaces) {
        var frequenciesByFaceMap = DiceFaceFrequencyCalculator.computeDiceFacesFrequencies(rollDiceFaces);
        return frequenciesByFaceMap.keySet().stream()
                .sorted(Comparator.reverseOrder())
                .filter(face -> isFaceOccurredMinimumTwoTimes(face, frequenciesByFaceMap))
                .findFirst()
                .map(face ->  face * FACE_OCCURRENCE)
                .orElse(0);
    }

    private static boolean isFaceOccurredMinimumTwoTimes(Integer face, Map<Integer, Integer> frequenciesByFaceMap) {
        return frequenciesByFaceMap.get(face) >= FACE_OCCURRENCE;
    }

}
