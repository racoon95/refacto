package com.ngandjeu.kata.yatzy.scocer;

import java.util.List;

public class FivesScorer {
    static final int FACE_FIVE = 5;

    private FivesScorer() {
    }

    public static int calculateScore(List<Integer> diceFaces) {
        var frequenciesByFaceMap = DiceFaceFrequencyCalculator.computeDiceFacesFrequencies(diceFaces);
        return frequenciesByFaceMap.get(FACE_FIVE) * FACE_FIVE;
    }
}
