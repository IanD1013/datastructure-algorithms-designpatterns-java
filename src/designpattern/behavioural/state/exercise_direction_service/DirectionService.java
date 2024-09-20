package designpattern.behavioural.state.exercise_direction_service;

/**
 * This is the class that powers our mapping app. It provides two
 * methods for calculating the estimated time of arrive and the
 * direction between two points
 */

public class DirectionService {
    private TravelMode travelMode;

    public DirectionService(TravelMode travelMode) {
        this.travelMode = travelMode;
    }

    public Object getEta() {
        return travelMode.getEta();
    }

    public Object getDirection() {
        return travelMode.getDirection();
    }

    public TravelMode getTravelMode() {
        return travelMode;
    }

    public void setTravelMode(TravelMode travelMode) {
        this.travelMode = travelMode;
    }
}
