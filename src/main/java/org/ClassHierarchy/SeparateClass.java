package org.ClassHierarchy;

public class SeparateClass {
    public static void main(String[] args) {

        Airport airport = new Airport("Denver International Airport", "Pena Boulevedar, Denver, Co");
        Airlines airlines = new Airlines("DIA", "Pena Bvdr", "United airlines", "720 395 4585");
        Passenger passenger = new Passenger("Dia", "Pena Blvdr", "Harry Potter", 345879);
        Security security = new Security("DIA", "Pena Blvdr", "Level 3");
        Terminal terminal = new Terminal("DIA", "Pena Blvdr", "West", 7000, "United");
        BaggageDepartment baggageDepartment = new BaggageDepartment("DIA", "Pena Bvdr", 1, 21.8);
        Flight flight = new Flight("DIA", "Pena Bvdr", "United airlines", "720 395 4585", 758, "05:40pm", "gate 7");
        BoardingPass boardingPass = new BoardingPass("DIA", "Pena Blv", "United", "720 395 4585", "Harry Potter", 5);
        Seat seat = new Seat("Dia", "Pena Blvdr", "Harry Potter", 345879, "Business class", 3);
        Crew crew = new Crew("DIA", "Pena Bvdr", "United airlines", "720 395 4585", "Voldemort", "pilot", 758);

        airport.airportInfo();
        airlines.airlinesInfo();
        passenger.passengerInfo();
        security.securityInfo();
        terminal.terminalInfo();
        baggageDepartment.baggageInfo();
        flight.flightInfo();
        boardingPass.boardingPassInfo();
        seat.seatInfo();
        crew.crewInfo();






   }
}