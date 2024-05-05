package com.practice.Assignments.lld2.day139factory.abstractfactoryaudio.decoder;

import com.practice.Assignments.lld2.day139factory.abstractfactoryaudio.MediaFormat;

public abstract class AudioDecoder {

    private final byte[] audioData;

    public AudioDecoder(byte[] audioData) {
        this.audioData = audioData;
    }

    public byte[] getAudioData() {
        return audioData;
    }

    public abstract MediaFormat supportsFormat();

    public abstract byte[] decode();
}