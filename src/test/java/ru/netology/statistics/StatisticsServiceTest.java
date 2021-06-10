package ru.netology.statistics;

import org.junit.jupiter.api.Test;
import ru.netology.statistics.StatisticsService;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxMin() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 3;

        long actual = service.findMaxMin(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void calculateSum() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};

        long expected = 85;

        long actual = service.calculateSum(incomesInBillions);

        assertEquals(expected, actual);

    }

    @Test
    void testFindMax() {

        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12,23, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 23;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}