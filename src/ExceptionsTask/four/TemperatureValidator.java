package ExceptionsTask.four;

public class TemperatureValidator {
    public static void validateTemperature(int temperature) throws InvalidTemperatureException {
        if (temperature < -10 || temperature > 35) {
            throw new InvalidTemperatureException("Неможливо використовувати пристрій при такій температурі");
        }
    }
}
