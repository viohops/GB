package Software_Architecture.HW4;

import java.util.UUID;

public class BusStop {
    private final UUID id;
    private final String name;
    private final double attitude;
    private final double latitude;

    public BusStop(String name, double attitude, double latitude) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.attitude = attitude;
        this.latitude = latitude;
    }

    public UUID getBStopId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAttitude() {
        return attitude;
    }

    public double getLatitude() {
        return latitude;
    }
}
