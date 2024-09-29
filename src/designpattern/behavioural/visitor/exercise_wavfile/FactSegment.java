package designpattern.behavioural.visitor.exercise_wavfile;

public class FactSegment extends Segment {
    @Override
    public void applyFilter(AudioFilter filter) {
        filter.apply(this);
    }
}
