package ru.dmdev.lesson8.композицияКлассовПрактика;

public class TimeInterval {
    private int seconnds;
    private int minutes;
    private int hours;

    public TimeInterval(int seconnds, int minutes, int hours) {
        this.seconnds = seconnds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public int totalSeconds () {
        return seconnds + minutes * 60 + hours *60 * 60;
    }
}
