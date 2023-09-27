package com.gridnine.testing;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrivalBeforeDepartureFilterTest {
    @Test
    void testDepartureBeforeNowFilter() {
        List<Flight> flights = FlightBuilder.createFlights();
        FlightFilter filter = new DepartureBeforeMomentNowFilter();
        List<Flight> filteredFlights = filter.filter(flights);
        assertEquals(7, filteredFlights.size());
    }
}
