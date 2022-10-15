import dto.MeasurementDto;
import dto.SensorDto;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        RestTemplate restTemplate = new RestTemplate();

        SensorDto sensorDto = new SensorDto("myNewSensor" + System.currentTimeMillis());

        String url1 = "http://localhost:8080/sensors/registration";
        String url2 = "http://localhost:8080/measurements/add";
        String url3 = "http://localhost:8080/measurements";

//        String response = restTemplate.postForObject(url1, sensorDto, String.class);
//        System.out.println(response);
//
//        for (int i = 0; i < 1000; i++) {
//            double f = Math.random() / Math.nextDown(1.0);
//            double x = -100 * (1.0 - f) + 100 * f;
//            MeasurementDto measurementDto = new MeasurementDto();
//            measurementDto.setSensor(sensorDto);
//            measurementDto.setValue((float) x);
//            measurementDto.setRaining(new Random().nextInt() % 2 == 0);
//            restTemplate.postForObject(url2, measurementDto, String.class);
//        }

        MeasurementDto[] measurements = restTemplate.getForObject(url3, MeasurementDto[].class);

        for (MeasurementDto measurement : measurements) {
            System.out.println(measurement.getValue() + ", " + measurement.getRaining() + ", " + measurement.getCreatedAt() + ", " + measurement.getSensor().getName());
        }
    }
}
