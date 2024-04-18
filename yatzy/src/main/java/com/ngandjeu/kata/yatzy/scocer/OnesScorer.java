package com.ngandjeu.kata.yatzy.scocer;

import java.util.List;

public class OnesScorer {

    private OnesScorer() {
    }
    static final int FACE_ONE  = 1;

    public static int calculateScore(List<Integer> diceFaces) {
        var frequenciesByFaceMap = DiceFaceFrequencyCalculator.computeDiceFacesFrequencies(diceFaces);
        return frequenciesByFaceMap.get(FACE_ONE) * FACE_ONE;
    }
}
