package dto;

public class SensorDto {
    private String name;

    public SensorDto() {
    }

    public SensorDto(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
