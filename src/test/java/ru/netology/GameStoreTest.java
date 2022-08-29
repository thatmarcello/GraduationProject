package ru.netology;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class GameStoreTest {

    @Test
    public void shouldAddGame() {

        GameStore store = new GameStore();
        Game game = store.publishGame("Нетология Баттл Онлайн", "Аркады");

        assertTrue(store.containsGame(game));
    }

    // другие ваши тесты
    @Test
    public void shouldGetMostPlayerEquallyOne() {

        GameStore store = new GameStore();

        store.addPlayTime("Пётр", 1);

        String actual = store.getMostPlayer();
        String expected = "Пётр";
        assertEquals(expected, actual);
    }

    @Test
    public void shouldGetSumPlayedTime() {

        GameStore store = new GameStore();

        store.addPlayTime("Анна", 2);
        store.addPlayTime("Петя", 5);
        store.addPlayTime("Галя", 3);

        int actual = store.getSumPlayedTime();
        int expected = 10;
        assertEquals(expected, actual);
    }
}
