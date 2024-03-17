package Software_Architecture.HW4;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public class Ticket {
    private BigDecimal price;
    private LocalDateTime date;
    private UUID startZone;
    private UUID finishZone;
    private boolean isLuggage;
    private int place;
    private int roadNumber;
    private UUID routeId;

    public Ticket(BigDecimal price, LocalDateTime date, TransportZone startZone, TransportZone finishZone,
            boolean isLuggage, int place, int roadNumber, BusRoute route) {
        this.price = price;
        this.date = date;
        this.startZone = startZone.getTZoneId();
        this.finishZone = finishZone.getTZoneId();
        this.isLuggage = isLuggage;
        this.place = place;
        this.roadNumber = roadNumber;
        this.routeId = route.getBRouteId();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public UUID getStartZone() {
        return startZone;
    }

    public UUID getFinishZone() {
        return finishZone;
    }

    public boolean isLuggage() {
        return isLuggage;
    }

    public int getPlace() {
        return place;
    }

    public int getRoadNumber() {
        return roadNumber;
    }

    public UUID getRouteId() {
        return routeId;
    }
}
