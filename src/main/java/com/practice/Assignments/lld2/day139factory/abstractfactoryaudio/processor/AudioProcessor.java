package com.practice.Assignments.lld2.day139factory.abstractfactoryaudio.processor;

import com.practice.Assignments.lld2.day139factory.abstractfactoryaudio.MediaFormat;

public abstract class AudioProcessor {

    private final byte[] audioData;

    public AudioProcessor(byte[] audioData) {
        this.audioData = audioData;
    }

    public byte[] getAudioData() {
        return audioData;
    }

    public abstract MediaFormat supportsFormat();

    public abstract byte[] process();
}
