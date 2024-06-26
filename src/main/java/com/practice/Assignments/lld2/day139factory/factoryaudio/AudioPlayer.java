package com.practice.Assignments.lld2.day139factory.factoryaudio;

public abstract class AudioPlayer {
    protected int volume;
    protected double playBackRate;
    public abstract MediaFormat supportsType();
    public abstract void play();
    public abstract void pause();
    public abstract void stop();
    public abstract int getVolume();
    public abstract void setVolume(int volume);
    public abstract double getPlayBackRate();
}
