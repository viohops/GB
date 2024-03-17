package Software_Architecture.HW4;

import java.util.UUID;

public class TransportZone extends BusStop {
    private UUID id;
    private String remark;

    public TransportZone(String name, double attitude, double latitude, String remark) {
        super(name, attitude, latitude);
        this.id = UUID.randomUUID();
        this.remark = remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return remark;
    }

    public UUID getTZoneId() {
        return id;
    }
}
