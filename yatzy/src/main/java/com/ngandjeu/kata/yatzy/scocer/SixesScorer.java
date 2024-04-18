package com.ngandjeu.kata.yatzy.scocer;

import java.util.List;

public class SixesScorer {

    private SixesScorer() {
    }
    private static final int FACE_SIX  = 6;

    public static int calculateScore(List<Integer> diceFaces) {
        var frequenciesByFaceMap = DiceFaceFrequencyCalculator.computeDiceFacesFrequencies(diceFaces);
        return frequenciesByFaceMap.get(FACE_SIX) * FACE_SIX;
    }
}
