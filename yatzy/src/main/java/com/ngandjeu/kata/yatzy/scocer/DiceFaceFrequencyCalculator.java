package com.ngandjeu.kata.yatzy.scocer;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DiceFaceFrequencyCalculator {

    private DiceFaceFrequencyCalculator() {
    }
    private static final int[] DICE_FACES = {6, 5, 4, 3, 2, 1};

    protected static Map<Integer, Integer> computeDiceFacesFrequencies(final List<Integer> rollDiceFaces) {
        var frequenciesByFaceMap = computeFrequencyForRollDiceFaces(rollDiceFaces);
        initFrequencyForRollMissedFaces(frequenciesByFaceMap);
        return frequenciesByFaceMap;
    }

    private static void initFrequencyForRollMissedFaces(final Map<Integer, Integer> frequenciesByFaceMap) {
        Arrays.stream(DICE_FACES).boxed().forEach(face -> frequenciesByFaceMap.putIfAbsent(face, 0) );
    }

    private static Map<Integer, Integer> computeFrequencyForRollDiceFaces(final List<Integer> rollDiceFaces) {
       return rollDiceFaces.stream()
                .collect(Collectors.groupingBy( Function.identity(), Collectors.summingInt(e -> 1) ));
    }
}
