package com.ngandjeu.kata.yatzy.scocer;

import java.util.List;
import java.util.Optional;

public class YatzyPointsScorer {

    private YatzyPointsScorer() {
    }

    public static int calculateScore(List<Integer> diceFaces) {
        return Optional.of(diceFaces)
                .filter(faces -> isAllDiceFacesSame(diceFaces))
                .map(faces -> 50)
                .orElse(0);
    }

    private static boolean isAllDiceFacesSame(List<Integer> diceFaces) {
        var frequenciesByFaceMap = DiceFaceFrequencyCalculator.computeDiceFacesFrequencies(diceFaces);
        return frequenciesByFaceMap.containsValue(5);
    }
}
