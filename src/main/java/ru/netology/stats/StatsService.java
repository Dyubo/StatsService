package ru.netology.stats;

public class StatsService {

    public int calculateSum(int[] values) {
        int month = 0;
        int sum = 0;
        for (int value : values) {
            sum += value;
            month = month + 1;
        }

        return sum;
    }

    //values.length = 12.
    public int averageSellPerMonth(int[] values) {
        int averagePerMonth = calculateSum(values) / values.length;
        return averagePerMonth;
    }

    public int maxPeakSales(int[] values) {
        int currentMax = values[0];
        int month = 0;
        int maxSales = 0;
        for (int value : values) {

            month = month + 1;
            if (currentMax < value) {
                currentMax = value;
                maxSales = month;
            }
        }
        return maxSales;
    }

    public int minPeakSales(int[] values) {
        int currentMax = values[0];
        int month = 0;
        int maxSales = 0;
        for (int value : values) {

            month = month + 1;
            if (currentMax > value) {
                currentMax = value;
                maxSales = month;
            }
        }
        return maxSales;
    }

    public int belowTheAverage(int[] values) {
        int month = 0;
        int maxInMonth = averageSellPerMonth(values);
        for (int value : values) {

            if (value < maxInMonth) {
                month = month + 1;

            }
        }
        return month;
    }

    public int aboveTheAverage(int[] values) {
        int month = 0;
        int maxInMonth = averageSellPerMonth(values);
        for (int value : values) {

            if (value > maxInMonth) {
                month = month + 1;

            }
        }
        return month;
    }
}












