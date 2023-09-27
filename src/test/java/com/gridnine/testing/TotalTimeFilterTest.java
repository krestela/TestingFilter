package com.gridnine.testing;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TotalTimeFilterTest {
    @Test
    void testTotalTimeFilter() {
        List<Flight> flights = FlightBuilder.createFlights();

        FlightFilter filter = new TotalTimeFilter();
        List<Flight> filteredFlights = filter.filter(flights);
        assertEquals(3, filteredFlights.size());
    }
}
