package com.ngandjeu.kata.yatzy.scocer;

import java.util.List;

public class FoursScorer {

    private FoursScorer() {
    }
    static final int FACE_FOUR  = 4;

    public static int calculateScore(List<Integer> diceFaces) {
        var frequenciesByFaceMap = DiceFaceFrequencyCalculator.computeDiceFacesFrequencies(diceFaces);
        return frequenciesByFaceMap.get(FACE_FOUR) * FACE_FOUR;
    }
}
