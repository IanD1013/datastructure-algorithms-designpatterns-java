package designpattern.behavioural.visitor.exercise_wavfile;

public class Main {
    public static void main(String[] args) {
        var wavFile = WavFile.read("myfile.wav");
        wavFile.applyFilter(new NoiseReductionFilter());
        wavFile.applyFilter(new ReverbFilter());
        wavFile.applyFilter(new NormalizeFilter());
    }
}
