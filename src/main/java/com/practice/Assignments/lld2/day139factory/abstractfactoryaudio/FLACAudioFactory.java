package com.practice.Assignments.lld2.day139factory.abstractfactoryaudio;

import com.practice.Assignments.lld2.day139factory.abstractfactoryaudio.decoder.AudioDecoder;
import com.practice.Assignments.lld2.day139factory.abstractfactoryaudio.decoder.FLACDecoder;
import com.practice.Assignments.lld2.day139factory.abstractfactoryaudio.player.AudioPlayer;
import com.practice.Assignments.lld2.day139factory.abstractfactoryaudio.player.FLACPlayer;
import com.practice.Assignments.lld2.day139factory.abstractfactoryaudio.processor.AudioProcessor;
import com.practice.Assignments.lld2.day139factory.abstractfactoryaudio.processor.FLACAudioProcessor;

public class FLACAudioFactory extends AudioFactory{
    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.FLAC;
    }

    @Override
    public AudioDecoder createAudioDecoder(byte[] audioData) {
        return new FLACDecoder(audioData);
    }

    @Override
    public AudioProcessor createAudioProcessor(byte[] audioData) {
        return new FLACAudioProcessor(audioData);
    }

    @Override
    public AudioPlayer createAudioPlayer(int volume, double playbackRate) {
        return new FLACPlayer(volume,playbackRate);
    }


}
