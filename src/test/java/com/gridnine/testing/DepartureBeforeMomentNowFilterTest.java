package com.gridnine.testing;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DepartureBeforeMomentNowFilterTest {
    @Test
    void testArrivalBeforeDepartureFilter() {
        List<Flight> flights = FlightBuilder.createFlights();
        FlightFilter filter = new ArrivalBeforeDepartureFilter();
        List<Flight> filteredFlights = filter.filter(flights);
        assertEquals(7, filteredFlights.size());
    }


}
