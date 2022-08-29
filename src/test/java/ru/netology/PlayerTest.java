package ru.netology;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PlayerTest {

    @Test
    public void shouldSumGenreIfOneGame() {
        GameStore store = new GameStore();
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");
        Game game1 = store.publishGame("PUBG", "Battle Royal");
        Game game3 = store.publishGame("CoD", "Battle Royal");

        Player player = new Player("Petya");
        player.installGame(game);
        player.installGame(game1);
        player.installGame(game3);
        player.play(game, 3);
        player.play(game1, 2);
        player.play(game3, 1);
        player.play(game1, 1);

        int expected = 4;
        int actual = player.sumGenre("Battle Royal");
        assertEquals(expected, actual);
    }

    // другие ваши тесты
    @Test
    public void shouldThrowRunTimeException() {
        GameStore store = new GameStore();
        Game game = store.publishGame("Call of Duty", "Battle Royal");
        Game game1 = store.publishGame("Uncharted", "Battle Royal" );
        Game game3 = store.publishGame("Нетология Баттл Онлайн", "Аркады");

        Player player = new Player("Petya");
        player.installGame(game);


        assertThrows(RuntimeException.class, () -> {
            player.play(game3, 1);

        });
    }
    @Test
    public void shouldMostPlayerByGenre() {
        GameStore store = new GameStore();
        Game game = store.publishGame("Call of Duty", "Battle Royal");
        Game game1 = store.publishGame("Uncharted", "Battle Royal");
        Game game3 = store.publishGame("Нетология Баттл Онлайн", "Аркады");

        Player player = new Player("Petya");
        player.installGame(game);
        player.installGame(game1);
        player.installGame(game3);
        player.play(game, 3);
        player.play(game1, 2);
        player.play(game3, 1);

        String expected = "Call of Duty";
        String actual = player.mostPlayerByGenre("Battle Royal");
        assertEquals(expected, actual);
    }
}
