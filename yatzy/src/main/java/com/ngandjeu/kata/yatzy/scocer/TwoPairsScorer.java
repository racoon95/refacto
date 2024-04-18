package com.ngandjeu.kata.yatzy.scocer;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class TwoPairsScorer{

    private TwoPairsScorer() {
    }
    private static final int FACE_OCCURRENCE  = 2;

    public static Integer calculateScore(List<Integer> rollDiceFaces) {
        var frequenciesByFaceMap = DiceFaceFrequencyCalculator.computeDiceFacesFrequencies(rollDiceFaces);
       return Optional.of(rollDiceFaces)
                .filter(faces -> isTwoPairsScorer(frequenciesByFaceMap))
                .map(faces -> calculateSuccessScore(frequenciesByFaceMap))
                .orElse(0);

    }

    static boolean isTwoPairsScorer(Map<Integer, Integer> frequenciesByFaceMap) {
        return frequenciesByFaceMap.values()
                .stream()
                .filter(faceOccurrence -> faceOccurrence >= FACE_OCCURRENCE)
                .toList()
                .size() == 2;

    }

    private static int calculateSuccessScore(Map<Integer, Integer> frequenciesByFaceMap) {
        return frequenciesByFaceMap.keySet().stream()
                .sorted(Comparator.reverseOrder())
                .filter(face -> frequenciesByFaceMap.get(face) >= FACE_OCCURRENCE)
                .mapToInt(value -> value)
                .map(face -> face * FACE_OCCURRENCE)
                .sum();
    }
}
