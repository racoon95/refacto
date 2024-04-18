package com.ngandjeu.kata.yatzy;

import com.ngandjeu.kata.yatzy.scocer.WrongCategoryException;

import java.util.List;

public class YatzyGame {
    public int calculateRollScore(List<Integer> dices, String category) throws WrongCategoryException {
        YatzyGameCategoryScoreCalculator yatzyGameCategoryScoreCalculator = YatzyGameCategoryScoreCalculator.of(category);
        return yatzyGameCategoryScoreCalculator.calculate(dices);
    }
}
