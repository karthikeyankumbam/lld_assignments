package com.practice.Assignments.lld2.day139factory.factoryaudio;


public abstract class AudioPlayerFactory {
    public static AudioPlayer createAudioPlayer(MediaFormat mediaFormat, int volume, double playBackRate){
        return switch (mediaFormat) {
            case MP3 -> new MP3Player(volume, playBackRate);
            case FLAC -> new FLACPlayer(volume, playBackRate);
            case WAV -> new WAVPlayer(volume, playBackRate);
            default -> throw new IllegalArgumentException("Invalid Audio player type");
        };
    }
}
