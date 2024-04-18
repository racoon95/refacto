package com.ngandjeu.kata.yatzy.scocer;

import java.util.List;

public class ThreesScorer {

    private ThreesScorer() {
    }

    static final int FACE_THREE  = 3;

    public static int calculateScore(List<Integer> diceFaces) {
        var frequenciesByFaceMap = DiceFaceFrequencyCalculator.computeDiceFacesFrequencies(diceFaces);
        return frequenciesByFaceMap.get(FACE_THREE) * FACE_THREE;
    }
}
