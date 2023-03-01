package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {
    @Test
    public void sumSalesTest() {

        StatsService service = new StatsService();
        long[] yearStat = {2, 1, 3};
        long actual = service.sumSales(yearStat);
        long expected = 6;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void averageSalesTest() {

        StatsService service = new StatsService();
        long[] yearStat = {2, 1, 3};
        long actual = service.averageSales(yearStat);
        long expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minSalesTest() {

        StatsService service = new StatsService();
        long[] yearStat = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.minSales(yearStat);
        long expected = 9;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxSalesTest() {

        StatsService service = new StatsService();
        long[] yearStat = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.maxSales(yearStat);
        long expected = 8;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void aboveAverageSalesTest() {

        StatsService service = new StatsService();
        long[] yearStat = {1, 3, 2, 1, 4, 3};
        long actual = service.aboveAverageSales(yearStat);
        long expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void belowAverageSalesTest() {

        StatsService service = new StatsService();
        long[] yearStat = {1, 3, 2, 1, 4, 3};
        long actual = service.belowAverageSales(yearStat);
        long expected = 2;
        Assertions.assertEquals(expected, actual);
    }

}