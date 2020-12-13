package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {


    @Test
    void shouldCalculateSum() {
        StatsService service = new StatsService();
        int[] value = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.calculateSum(value);
        int expected = 180;
        assertEquals(actual, expected);

    }


    @Test
    void shouldAverageSellPerMonth() {
        StatsService service = new StatsService();
        int[] value = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.averageSellPerMonth(value);
        int expected = 15;
        assertEquals(actual, expected);

    }

    @Test
    void shouldMaxPeakSales() {
        StatsService service = new StatsService();
        int[] value = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.maxPeakSales(value);
        int expected = 6;
        assertEquals(actual, expected);
    }

    @Test
    void shouldMinPeakSales() {
        StatsService service = new StatsService();
        int[] value = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.minPeakSales(value);
        int expected = 9;
        assertEquals(actual, expected);
    }

    @Test
    void shouldBelowTheAverage() {
        StatsService service = new StatsService();
        int[] value = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.belowTheAverage(value);
        int expected = 5;
        assertEquals(actual, expected);
    }

    @Test
    void shouldAboveTheAverage() {
        StatsService service = new StatsService();
        int[] value = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int actual = service.belowTheAverage(value);
        int expected = 5;
        assertEquals(actual, expected);
    }
}


