package com.gridnine.testing;


import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Flight> flights = FlightBuilder.createFlights();

        FlightFilter departureBeforeMomentNowFilter = new DepartureBeforeMomentNowFilter();
        FlightFilter arrivalBeforeDepartureFilter = new ArrivalBeforeDepartureFilter();
        FlightFilter totalTimeFilter = new TotalTimeFilter();

        System.out.println("Перелёты до текущего момента времени:");
        printFilteredFlights(departureBeforeMomentNowFilter.filter(flights));

        System.out.println("\nПерелёты с сегментами, где дата прилета раньше даты вылета:");
        printFilteredFlights(arrivalBeforeDepartureFilter.filter(flights));

        System.out.println("\nПерелёты с общим временем на земле более двух часов:");
        printFilteredFlights(totalTimeFilter.filter(flights));
    }

    private static void printFilteredFlights(List<Flight> filteredFlights) {
        filteredFlights.forEach(System.out::println);
    }
}
