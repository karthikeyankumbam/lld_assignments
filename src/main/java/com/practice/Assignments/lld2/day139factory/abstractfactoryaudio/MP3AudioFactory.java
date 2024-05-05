package com.practice.Assignments.lld2.day139factory.abstractfactoryaudio;

import com.practice.Assignments.lld2.day139factory.abstractfactoryaudio.decoder.AudioDecoder;
import com.practice.Assignments.lld2.day139factory.abstractfactoryaudio.decoder.MP3Decoder;
import com.practice.Assignments.lld2.day139factory.abstractfactoryaudio.player.AudioPlayer;
import com.practice.Assignments.lld2.day139factory.abstractfactoryaudio.player.MP3Player;
import com.practice.Assignments.lld2.day139factory.abstractfactoryaudio.processor.AudioProcessor;
import com.practice.Assignments.lld2.day139factory.abstractfactoryaudio.processor.MP3AudioProcessor;


public class MP3AudioFactory extends AudioFactory{
    @Override
    public MediaFormat supportsFormat() {
        return MediaFormat.MP3;
    }

    @Override
    public AudioDecoder createAudioDecoder(byte[] audioData) {
        return new MP3Decoder(audioData);
    }

    @Override
    public AudioProcessor createAudioProcessor(byte[] audioData) {
        return new MP3AudioProcessor(audioData);
    }

    @Override
    public AudioPlayer createAudioPlayer(int volume, double playbackRate) {
        return new MP3Player(volume,playbackRate);
    }
}
