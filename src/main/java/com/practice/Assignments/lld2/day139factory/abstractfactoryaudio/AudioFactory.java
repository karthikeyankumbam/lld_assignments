package com.practice.Assignments.lld2.day139factory.abstractfactoryaudio;

import com.practice.Assignments.lld2.day139factory.abstractfactoryaudio.decoder.AudioDecoder;
import com.practice.Assignments.lld2.day139factory.abstractfactoryaudio.player.AudioPlayer;
import com.practice.Assignments.lld2.day139factory.abstractfactoryaudio.processor.AudioProcessor;

public abstract class AudioFactory {
    // Abstract method for getting the format of audio the factory supports
    public abstract MediaFormat supportsFormat();
    public abstract AudioDecoder createAudioDecoder(byte[] audioData);

    public abstract AudioProcessor createAudioProcessor(byte[] audioData);

    public abstract AudioPlayer createAudioPlayer(int volume, double playbackRate);
}
