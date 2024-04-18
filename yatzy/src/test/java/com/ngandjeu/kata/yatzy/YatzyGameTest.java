package com.ngandjeu.kata.yatzy;

import com.ngandjeu.kata.yatzy.scocer.WrongCategoryException;
import org.testng.annotations.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class YatzyGameTest {

    @Test
    public void should_score_sum_of_all_dice_when_category_is_CHANCE() throws WrongCategoryException {
        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 15;

        // When
        int score = yatzyGame.calculateRollScore(List.of(2,3,4,5,1), "CHANCE");

        // Then
        assertThat(score).isEqualTo(expectedScore);

        // Given
        expectedScore = 16;

        // When
         score = yatzyGame.calculateRollScore(List.of(3,3,4,5,1), "CHANCE");

        // Then
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    public void should_score_50_when_category_YATZY() throws WrongCategoryException {

        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 50;

        // When
        int score = yatzyGame.calculateRollScore(List.of(4,4,4,4,4), "YATZY");

        // Then
        assertThat(score).isEqualTo(expectedScore);

        // When
        score = yatzyGame.calculateRollScore(List.of(6,6,6,6,6), "YATZY");

        // Then
        assertThat(score).isEqualTo(expectedScore);
    }


    @Test
    public void should_score_0_when_category_YATZY() throws WrongCategoryException {

        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 0;

        // When
        int score = yatzyGame.calculateRollScore(List.of(6,6,6,6,3), "YATZY");

        // Then
        assertThat(score).isEqualTo(expectedScore);
    }


    @Test
    public void should_score_1_when_category_ONES() throws WrongCategoryException {

        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 1;

        // When
        int score = yatzyGame.calculateRollScore(List.of(1,2,3,4,5), "ONES");

        // Then
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    public void should_score_2_when_category_ONES() throws WrongCategoryException {

        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 2;

        // When
        int score = yatzyGame.calculateRollScore(List.of(1,2,1,4,5), "ONES");

        // Then
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    public void should_score_0_when_category_ONES() throws WrongCategoryException {

        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 0;

        // When
        int score = yatzyGame.calculateRollScore(List.of(6,2,2,4,5), "ONES");

        // Then
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    public void should_score_4_when_category_ONES() throws WrongCategoryException {

        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 4;

        // When
        int score = yatzyGame.calculateRollScore(List.of(1,2,1,1,1), "ONES");

        // Then
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    public void should_score_4_when_category_TWOS() throws WrongCategoryException {

        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 4;

        // When
        int score = yatzyGame.calculateRollScore(List.of(1,2,3,2,6), "TWOS");

        // Then
        assertThat(score).isEqualTo(expectedScore);
    }



    @Test
    public void should_score_10_when_category_TWOS() throws WrongCategoryException {

        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 10;

        // When
        int score = yatzyGame.calculateRollScore(List.of(2,2,2,2,2), "TWOS");

        // Then
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
        public void should_score_0_when_category_TWOS() throws WrongCategoryException {

        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 0;

        // When
        int score = yatzyGame.calculateRollScore(List.of(1,4,1,4,5), "TWOS");

        // Then
        assertThat(score).isEqualTo(expectedScore);
    }


    @Test
    public void should_score_6_when_category_THREES() throws WrongCategoryException {

        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 6;

        // When
        int score = yatzyGame.calculateRollScore(List.of(1,2,3,2,3), "THREES");

        // Then
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    public void should_score_12_when_category_THREES() throws WrongCategoryException {

        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 12;

        // When
        int score = yatzyGame.calculateRollScore(List.of(2,3,3,3,3), "THREES");

        // Then
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    public void should_score_12_when_category_FOURS() throws WrongCategoryException {

        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 12;

        // When
        int score = yatzyGame.calculateRollScore(List.of(4,4,4,5,5), "FOURS");

        // Then
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    public void should_score_8_when_category_FOURS() throws WrongCategoryException {

        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 8;

        // When
        int score = yatzyGame.calculateRollScore(List.of(4,4,5,5,5), "FOURS");

        // Then
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    public void should_score_4_when_category_FOURS() throws WrongCategoryException {

        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 4;

        // When
        int score = yatzyGame.calculateRollScore(List.of(4,5,5,5,5), "FOURS");

        // Then
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    public void should_score_10_when_category_FIVES() throws WrongCategoryException {

        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 10;

        // When
        int score = yatzyGame.calculateRollScore(List.of(4,4,4,5,5), "FIVES");

        // Then
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    public void should_score_15_when_category_FOURS() throws WrongCategoryException {

        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 15;

        // When
        int score = yatzyGame.calculateRollScore(List.of(4,4,5,5,5), "FIVES");

        // Then
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    public void should_score_20_when_category_FOURS() throws WrongCategoryException {

        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 20;

        // When
        int score = yatzyGame.calculateRollScore(List.of(4,5,5,5,5), "FIVES");

        // Then
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    public void should_score_0_when_category_SIXES() throws WrongCategoryException {

        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 0;

        // When
        int score = yatzyGame.calculateRollScore(List.of(4,4,4,5,5), "SIXES");

        // Then
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    public void should_score_6_when_category_SIXES() throws WrongCategoryException {

        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 6;

        // When
        int score = yatzyGame.calculateRollScore(List.of(4,4,6,5,5), "SIXES");

        // Then
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    public void should_score_18_when_category_SIXES() throws WrongCategoryException {

        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 18;

        // When
        int score = yatzyGame.calculateRollScore(List.of(6,5,6,6,5), "SIXES");

        // Then
        assertThat(score).isEqualTo(expectedScore);
    }



    @Test
    public void should_score_6_when_category_PAIR() throws WrongCategoryException {

        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 6;

        // When
        int score = yatzyGame.calculateRollScore(List.of(3,4,3,5,6), "PAIR");

        // Then
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    public void should_score_10_when_category_PAIR() throws WrongCategoryException {

        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 10;

        // When
        int score = yatzyGame.calculateRollScore(List.of(5,3,3,3,5), "PAIR");

        // Then
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    public void should_score_12_when_category_SIXES() throws WrongCategoryException {

        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 12;

        // When
        int score = yatzyGame.calculateRollScore(List.of(5,3,6,6,5), "PAIR");

        // Then
        assertThat(score).isEqualTo(expectedScore);
    }



    @Test
    public void should_score_16_when_category_TWO_PAIR() throws WrongCategoryException {

        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 16;

        // When
        int score = yatzyGame.calculateRollScore(List.of(3,3,5,4,5), "TWO_PAIRS");

        // Then
        assertThat(score).isEqualTo(expectedScore);


        // When
        score = yatzyGame.calculateRollScore(List.of(3,3,5,5,5), "TWO_PAIRS");

        // Then
        assertThat(score).isEqualTo(expectedScore);
    }





    @Test
    public void should_score_9_when_category_THREE_OF_A_KIND() throws WrongCategoryException {

        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 9;

        // When
        int score = yatzyGame.calculateRollScore(List.of(3,3,3,4,5), "THREE_OF_A_KIND");

        // Then
        assertThat(score).isEqualTo(expectedScore);

        // When
        score = yatzyGame.calculateRollScore(List.of(3,3,3,3,5), "THREE_OF_A_KIND");

        // Then
        assertThat(score).isEqualTo(expectedScore);

        // When
        score = yatzyGame.calculateRollScore(List.of(3,3,3,3,3), "THREE_OF_A_KIND");

        // Then
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    public void should_score_15_when_category_THREE_OF_A_KIND() throws WrongCategoryException {

        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 15;

        // When
        int score = yatzyGame.calculateRollScore(List.of(5,3,5,4,5), "THREE_OF_A_KIND");

        // Then
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    public void should_score_12_when_category_FOUR_OF_A_KIND() throws WrongCategoryException {

        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 12;

        // When
        int score = yatzyGame.calculateRollScore(List.of(3,3,3,3,5), "FOUR_OF_A_KIND");

        // Then
        assertThat(score).isEqualTo(expectedScore);
    }


    @Test
    public void should_score_20_when_category_FOUR_OF_A_KIND() throws WrongCategoryException {

        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 20;

        // When
        int score = yatzyGame.calculateRollScore(List.of(5,5,5,4,5), "FOUR_OF_A_KIND");

        // Then
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    public void should_score_15_when_category_SMALL_STRAIGHT() throws WrongCategoryException {

        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 15;

        // When
        int score = yatzyGame.calculateRollScore(List.of(1,2,3,4,5), "SMALL_STRAIGHT");

        // Then
        assertThat(score).isEqualTo(expectedScore);

        // When
         score = yatzyGame.calculateRollScore(List.of(2,3,4,5,1), "SMALL_STRAIGHT");

        // Then
        assertThat(score).isEqualTo(expectedScore);
    }



    @Test
    public void should_score_0_when_category_SMALL_STRAIGHT() throws WrongCategoryException {

        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 0;

        // When
        int score = yatzyGame.calculateRollScore(List.of(1,2,2,4,5), "SMALL_STRAIGHT");

        // Then
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    public void should_score_20_when_category_LARGE_STRAIGHT() throws WrongCategoryException {

        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 20;

        // When
        int score = yatzyGame.calculateRollScore(List.of(6,2,3,4,5), "LARGE_STRAIGHT");

        // Then
        assertThat(score).isEqualTo(expectedScore);

        // When
        score = yatzyGame.calculateRollScore(List.of(2,3,4,5,6), "LARGE_STRAIGHT");

        // Then
        assertThat(score).isEqualTo(expectedScore);
    }



    @Test
    public void should_score_0_when_category_LARGE_STRAIGHT() throws WrongCategoryException {

        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 0;

        // When
        int score = yatzyGame.calculateRollScore(List.of(1,2,2,4,5), "LARGE_STRAIGHT");

        // Then
        assertThat(score).isEqualTo(expectedScore);
    }

    @Test
    public void should_score_18_when_category_FULL_HOUSE() throws WrongCategoryException {

        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 18;

        // When
        int score = yatzyGame.calculateRollScore(List.of(6,2,2,2,6), "FULL_HOUSE");

        // Then
        assertThat(score).isEqualTo(expectedScore);

    }

    @Test
    public void should_score_0_when_category_FULL_HOUSE() throws WrongCategoryException {

        // Given
        YatzyGame yatzyGame = new YatzyGame();
        int expectedScore = 0;

        // When
        int score = yatzyGame.calculateRollScore(List.of(2,3,4,5,6), "FULL_HOUSE");

        // Then
        assertThat(score).isEqualTo(expectedScore);
    }



}
