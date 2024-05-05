package com.practice.Assignments.lld2.day139factory.abstractfactoryaudio.decoder;

import com.practice.Assignments.lld2.day139factory.abstractfactoryaudio.MediaFormat;
import com.practice.Assignments.lld2.day139factory.abstractfactoryaudio.decoder.AudioDecoder;

public class FLACDecoder extends AudioDecoder {

    public FLACDecoder(byte[] audioData) {
        super(audioData);
    }

    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.FLAC;
    }

    @Override
    public byte[] decode() {
        // Implement FLAC decoding logic
        System.out.println("Decoding FLAC audio data...");
        // Decoding process
        return getAudioData();
    }
}
