package ru.netology.stats;

public class StatsService {

    public int CalculateSum(int[] values) {
        int month = 0;
        int sum = 0;
        for (int value : values) {
            sum += value;
            month = month + 1;
        }

        return sum;
    }

    public int StatsServiceSumImrove(int[] values) {
        int month = 0;
        int sum = 0;
        for (int value : values) {
            sum += value;
            month = month + 1;
        }

        return sum;
    }

    public int AverageSellPerMonth(int[] values) {
        int averagePerMonth = StatsServiceSumImrove(values) / values.length;
        return averagePerMonth;
    }

    public int MaxPeakSales(int[] values) {
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

    public int MinPeakSales(int[] values) {
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

    public int BelowTheAverage(int[] values) {
        int month = 0;
        int maxInMonth = AverageSellPerMonth(values);
        for (int value : values) {

            if (value < maxInMonth) {
                month = month + 1;

            }
        }
        return month;
    }

    public int AboveTheAverage(int[] values) {
        int month = 0;
        int maxInMonth = AverageSellPerMonth(values);
        for (int value : values) {

            if (value > maxInMonth) {
                month = month + 1;

            }
        }
        return month;
    }
}












