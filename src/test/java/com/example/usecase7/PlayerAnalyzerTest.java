package com.example.usecase7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class PlayerAnalyzerTest {

    private PlayerAnalyzer playerAnalyzer = new PlayerAnalyzer();

    @Test
    void normalPlayerTest() {
        List<Player> input = new ArrayList<>();

        input.add(
            new Player(
                "player1",
                25,
                5,
                Arrays.asList(2, 2, 2)
            )
        );

        double score = playerAnalyzer.calculateScore(input);

        assertThat(score).isEqualTo(250);
    }

    @Test
    void juniorPlayerTest() {
        List<Player> input = new ArrayList<>();

        input.add(
            new Player(
                "player1",
                15,
                3,
                Arrays.asList(3, 3, 3)
            )
        );

        double score = playerAnalyzer.calculateScore(input);

        assertThat(score).isEqualTo(67.5);
    }

    @Test
    void seniorPlayerTest() {
        List<Player> input = new ArrayList<>();

        input.add(
            new Player(
                "player1",
                35,
                15,
                Arrays.asList(4, 4, 4)
            )
        );

        double score = playerAnalyzer.calculateScore(input);

        assertThat(score).isEqualTo(2520);
    }

    @Test
    void multiplePlayersTest() {
        List<Player> input = new ArrayList<>();

        input.add(
            new Player(
                "player1",
                35,
                15,
                Arrays.asList(4, 4, 4)
            )
        );

        input.add(
            new Player(
                "player2",
                15,
                3,
                Arrays.asList(3, 3, 3)
            )
        );

        input.add(
            new Player(
                "player3",
                25,
                5,
                Arrays.asList(2, 2, 2)
            )
        );

        double score = playerAnalyzer.calculateScore(input);

        assertThat(score).isEqualTo(2837.5);
    }

    @Test
    void emptyPlayerListTest() {
        List<Player> input = new ArrayList<>();

        double score = playerAnalyzer.calculateScore(input);

        assertThat(score).isEqualTo(0);
    }

    @Test
    void nullInputTest() {
        assertThrows(NullPointerException.class, () -> playerAnalyzer.calculateScore(null));
    }
}
