package task7;

// Класс, сохраняющий данные от метеодатчиков
public class MeteoStore {
    // сохранение данных в базу

    boolean save(MeteoSensor meteoSensor){
        System.out.format("Saving data from sensor [%d] at %s%n temperature - % ; + humidity - %f ; pressure -%f \n\r",
        meteoSensor.getId(),
        meteoSensor.getDateTime(),
        meteoSensor.getTemperature(),
        meteoSensor.getHumidity(),
        meteoSensor.getPressure());
        return true;
    }
}
