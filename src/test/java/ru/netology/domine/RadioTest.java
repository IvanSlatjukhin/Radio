package ru.netology.domine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    void stationLimMin() {// Если станция 1-1=0
        Radio radio = new Radio();
        radio.setCurrentStation(-1);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void stationLimMax() {// Если станция 9+1=0
        Radio radio = new Radio();
        radio.setCurrentStation(10);
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void stationNext() {// если станция 3+1=4
        Radio radio = new Radio();
        radio.setCurrentStation(3);
        radio.nextStation();
        int expected = 4;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void stationNextTwo() {// Если станция 9+1=0
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void stationPrevious() {// если станция 0-1=9
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void stationPreviousTwo() {// Если станция 4-1=3
        Radio radio = new Radio();
        radio.setCurrentStation(4);
        radio.prevStation();
        int expected = 3;
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void stationInput() {//Задать номер станции (1-9)
        Radio radio = new Radio();
        int currentStation = 8;
        int expected = 8;
        radio.stationInput(currentStation);
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void stationInputTwo() {// Задать номер станции (1-9)
        Radio radio = new Radio();
        int currentStation = -1;
        int expected = 0;
        radio.stationInput(currentStation);
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void stationInputTree() {// Задать номер станции (1-9)
        Radio radio = new Radio();
        int currentStation = 10;
        int expected = 0;
        radio.stationInput(currentStation);
        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @Test
    void currentVolume() {// Получить уровень звука
        Radio radio = new Radio();
        int expected = 0;
        radio.getCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void stationVolumeUp() {// Если громкость 10+1=10
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.volumeUp();// Обращение к volumeUp
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void stationVolumeUpTwo() {// Если громкость 5+1=6
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.volumeUp();
        int expected = 6;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void stationVolumeDown() {// Если громкость 0-1=0
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.volumeDown();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @Test
    void stationVolumeDownTwo() {// Если громкость 6-1=5
        Radio rad = new Radio();
        rad.setCurrentVolume(6);
        rad.volumeDown();
        int expected = 5;
        int actual = rad.getCurrentVolume();
        assertEquals(expected, actual);
    }
}
