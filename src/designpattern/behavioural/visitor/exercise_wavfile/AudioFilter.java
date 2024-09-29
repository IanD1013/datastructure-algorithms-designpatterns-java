package designpattern.behavioural.visitor.exercise_wavfile;

public interface AudioFilter {
    void apply(FormatSegment formatSegment);
    void apply(FactSegment factSegment);
}
