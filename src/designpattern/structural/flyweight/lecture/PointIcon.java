package designpattern.structural.flyweight.lecture;

public class PointIcon {
    private final PointType type; // 4 bytes
    private final byte[] icon;    // icon for each point: 20 KB

    public PointIcon(PointType type, byte[] icon) {
        this.type = type;
        this.icon = icon;
    }

    public PointType getType() {
        return type;
    }
}
