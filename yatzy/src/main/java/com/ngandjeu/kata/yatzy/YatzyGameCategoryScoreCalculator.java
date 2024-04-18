package com.ngandjeu.kata.yatzy;
import com.ngandjeu.kata.yatzy.scocer.*;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public enum YatzyGameCategoryScoreCalculator {
    CHANCE("CHANCE", ChanceScorer::calculateScore),
    YATZY("YATZY", YatzyPointsScorer::calculateScore),
    ONES("ONES", OnesScorer::calculateScore),
    TWOS("TWOS", TwosScorer::calculateScore),
    THREES("THREES", ThreesScorer::calculateScore),
    FOURS("FOURS", FoursScorer::calculateScore),
    FIVES("FIVES", FivesScorer::calculateScore),
    SIXES("SIXES", SixesScorer::calculateScore),
    PAIR("PAIR", PairScorer::calculateScore),
    THREE_OF_A_KIND("THREE_OF_A_KIND", ThreeOfAKindScorer::calculateScore),
    FOUR_OF_A_KIND("FOUR_OF_A_KIND", FourOfAKindScorer::calculateScore),
    SMALL_STRAIGHT("SMALL_STRAIGHT", SmallStraightScorer::calculateScore),
    LARGE_STRAIGHT("LARGE_STRAIGHT", LargeStraightScorer::calculateScore),
    TWO_PAIRS("TWO_PAIRS", TwoPairsScorer::calculateScore),
    FULL_HOUSE("FULL_HOUSE", FullHouseScorer::calculateScore);


    private final Function<List<Integer>, Integer> scoreCalculator;
    private final String category;

    YatzyGameCategoryScoreCalculator(String category, Function<List<Integer>, Integer> scoreCalculator) {
        this.scoreCalculator = scoreCalculator;
        this.category = category;
    }

    public static YatzyGameCategoryScoreCalculator of(String category) throws WrongCategoryException {
        return Arrays.stream(values())
                .filter(calculator -> calculator.category.equals(category))
                .findAny()
                .orElseThrow(() -> new WrongCategoryException("Unknown Category"));
    }

    public int calculate(List<Integer> dices) {
        return scoreCalculator.apply(dices);
    }
}
