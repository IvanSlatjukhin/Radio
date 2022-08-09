package ru.netology.domine;

public class Radio {
    private int currentStation;// Номер текущей (прослушиваемой) радиостанции
    private int currentVolume;// Громкость звука

    public int getCurrentStation() {// получить актуальный номер станции
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {//установить текущий номер станции
        if (currentStation < 0) {// Не может быть меньше 0
            return;
        }
        if (currentStation > 9) {// Не может быть больше 9
            return;
        }
        this.currentStation = currentStation;
    }

    public void nextStation() {// Нажать на кнопку пульта next следующая станция
        this.currentStation = currentStation + 1;
        if (currentStation > 9) {//станций 0-9 >= 10
            this.currentStation = 0;
        }
    }

    public void prevStation() {// нажать на кнопку пульта prev предыдущая станция
        this.currentStation = currentStation - 1;
        if (currentStation == -1) {//было 0 стало -1 =9
            this.currentStation = 9;
        }
    }

    public void stationInput(int currentStation) {// Задать номер станции
        if (currentStation < 0) { // Не должно быть отрицательным
            return;
        }
        if (currentStation > 9) {// Не должно быть больше 9
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentVolume() {// Получить уровень громкости звука
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {// Установить уровень громкости звука
        this.currentVolume = currentVolume;
    }

    public void volumeUp() {// Увеличить громкость звука на 1, если больше max то устанавливается max
        this.currentVolume = currentVolume + 1;
        if (currentVolume >= 10) { //(в пределах от 0 до 10)
            this.currentVolume = 10;
        }
    }

    public void volumeDown() {// Уменьшить громкость звука на 1 Если меньше min, то устанавливается min
        this.currentVolume = currentVolume - 1;
        if (currentVolume <= 0) { //(в пределах от 0 до 10)
            this.currentVolume = 0;
        }
    }
}
