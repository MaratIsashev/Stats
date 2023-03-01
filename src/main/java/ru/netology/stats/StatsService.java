package ru.netology.stats;

public class StatsService {

    public long sumSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum;
    }

    public long averageSales(long[] sales) {
        long sum = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        return sum / sales.length;
    }

    public long minSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public long maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int aboveAverageSales(long[] sales) {
        long sum = 0;
        int aboveAverageCounter = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        long average = sum / sales.length;
        for (long sale : sales) {
            if (sale > average) {
                aboveAverageCounter++;
            }
            ;
        }
        return aboveAverageCounter;
    }

    public int belowAverageSales(long[] sales) {
        long sum = 0;
        int belowAverageCounter = 0;
        for (long sale : sales) {
            sum = sum + sale;
        }
        long average = sum / sales.length;
        for (long sale : sales) {
            if (sale < average) {
                belowAverageCounter++;
            }
            ;
        }
        return belowAverageCounter;
    }
}
