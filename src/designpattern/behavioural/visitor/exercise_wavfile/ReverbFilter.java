package designpattern.behavioural.visitor.exercise_wavfile;

public class ReverbFilter implements AudioFilter {
    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Reverb filter on format segment");
    }

    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Reverb filter on fact segment");
    }
}