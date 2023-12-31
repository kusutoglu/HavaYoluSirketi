public class FlightExpeditionHelper {
    public String DetermineAirlineType(AirLine airLine) {
        if (airLine instanceof THY) {
            return "THY";
        } else if (airLine instanceof Pegasus) {
            return "Pegasus";
        } else {
            return "Tanımsız";
        }
    }

    public String DetermineFlightType(FlightType flightType) {
        if (flightType == FlightType.EXTROVERT) {
            return "Yurt Dışı";
        } else if (flightType == FlightType.INTROVERT) {
            return "Yurt İçi";
        } else {
            return "Tanımsız";
        }
    }
}