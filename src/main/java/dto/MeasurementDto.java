package dto;

import java.util.Date;

public class MeasurementDto {
    private float value;

    private Boolean raining;

    private SensorDto sensor;

    private Date createdAt;

    public MeasurementDto() {
    }

    public MeasurementDto(float value, Boolean raining, SensorDto sensor, Date createdAt) {
        this.value = value;
        this.raining = raining;
        this.sensor = sensor;
        this.createdAt = createdAt;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

    public Boolean getRaining() {
        return raining;
    }

    public void setRaining(Boolean raining) {
        this.raining = raining;
    }

    public SensorDto getSensor() {
        return sensor;
    }

    public void setSensor(SensorDto sensor) {
        this.sensor = sensor;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
