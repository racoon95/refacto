package com.ngandjeu.kata.yatzy.scocer;

import java.util.List;

public class TwosScorer  {

    private TwosScorer() {
    }

    static final int FACE_TWO  = 2;

    public static int calculateScore(List<Integer> diceFaces) {
        var frequenciesByFaceMap = DiceFaceFrequencyCalculator.computeDiceFacesFrequencies(diceFaces);
        return frequenciesByFaceMap.get(FACE_TWO) * FACE_TWO;
    }
}
