package org.classhierarchy;

public class Executor {
    public static void main(String[] args) {

        Airport airport = new Airport("Denver International Airport", "Pena Boulevedar, Denver, Co");
        Airlines airlines = new Airlines("DIA", "Pena Bvdr", "United airlines", "720 395 4585");
        Passenger passenger = new Passenger("Dia", "Pena Blvdr", "Harry Potter", 345879);
        Security security = new Security("DIA", "Pena Blvdr", "Level 3");
        Terminal terminal = new Terminal("DIA", "Pena Blvdr", "West", 7000, "United");
        BaggageDepartment baggageDepartment = new BaggageDepartment("DIA", "Pena Bvdr", 1, 21.8);
        Flight flight = new Flight("DIA", "Pena Bvdr", "United airlines", "720 395 4585", 758, "05:40pm", "gate 7");
        BoardingPass boardingPass = new BoardingPass("DIA", "Pena Blv", "United", "720 395 4585", "Harry Potter", 5, "New York", "10:00");
        Seat seat = new Seat("Dia", "Pena Blvdr", "Harry Potter", 345879, "Business class", 3);
        Crew crew = new Crew("DIA", "Pena Bvdr", "United airlines", "720 395 4585", "Voldemort", "pilot", 758);

        airport.getAirportInfo();
        airlines.getAirlinesInfo();
        passenger.getPassengerInfo();
        security.getSecurityInfo();
        terminal.getTerminalInfo();
        baggageDepartment.getBaggageInfo();
        flight.getFlightInfo();
        boardingPass.getBoardingPassInfo();
        seat.getSeatInfo();
        crew.getCrewInfo();

        Airlines airlines1 = new BoardingPass("DIA", "Penna blvd", "United", "7241", "Ron Wesley", 5, "Miami", "10:00");
        airlines1.fly();






   }
}
